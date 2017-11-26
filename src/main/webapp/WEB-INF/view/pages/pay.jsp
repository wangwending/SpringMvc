<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>顾客支付方式统计</title>
    <!-- 引入 echarts.js -->
    <script src="../js/echarts/echarts.js"></script>
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" media="all" href="../css/daterangepicker.css" />
    <script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="../js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../js/moment.js"></script>
    <script type="text/javascript" src="../js/daterangepicker.js"></script>
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">
        .demo {
            position: relative;
        }

        .demo i {
            position: absolute;
            bottom: 10px;
            right: 19px;
            top: auto;
            cursor: pointer;
        }

        div {
            display: inline-block;
        }
    </style>
</head>

<body>
    <div class="col-md-4 col-md-offset-2 demo">
        <h4>请选择查询日期</h4>
        <input type="text" id="config-demo" class="form-control">
        <i class="glyphicon glyphicon-calendar fa fa-calendar"></i>
    </div>
    <div class="col-md-4 col-md-offset-2 demo ">
        <h4>请选择大区</h4>
        <select class="combobox">
                    <option value="ALL">全国</option>
                    <option value="PA">华东大区</option>
                    <option value="CT">东北大区</option>
                    <option value="NY">华南大区</option>
                    <option value="MD">华北大区</option>
                    <option value="VA">华中大区</option>
                    <option value="VA">华西大区</option>
        </select>
    </div>
    <div class="col-md-4 col-md-offset-2 demo ">
        <h4>请选择维度</h4>
        <select class="combobox">
                    <option value="Y">年</option>
                    <option value="M">月</option>
                    <option value="D" selected="selected">日</option>
        </select>
     </div>
    <div class="col-md-4 col-md-offset-2 demo ">
        <button type="button" class="btn btn-default btn-sm">查询</button> 
    </div>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="width: 1350px;height:500px;"></div>
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));

        myChart.title = '顾客支付方式统计';
        var dateList = ['2017-09-01', '2017-09-02', '2017-09-03', '2017-09-04', '2017-09-05', '2017-09-06',
            '2017-09-07'
        ];

        var payType = ['微信', '支付宝', '百度钱包', '京东钱包', '翼支付', '现金'];
        var weChatData    =  [320, 302, 301, 334, 390, 330, 320];
        var aliPayData    =  [120, 132, 101, 134, 90, 230, 210];
        var baiduPayData  =  [220, 182, 191, 234, 290, 330, 310];
        var jdPayData     =  [150, 212, 201, 154, 190, 330, 410];
        var bestPayData   =  [820, 832, 901, 934, 1290, 1330, 1320];
        var cashData      =  [820, 832, 901, 934, 1290, 1330, 1320];

        option = {
            title: {
                text: '顾客支付方式统计'
            },
            tooltip: {
                trigger: 'axis',
                axisPointer: { // 坐标轴指示器，坐标轴触发有效
                    type: 'shadow' // 默认为直线，可选为：'line' | 'shadow'
                }
            },
            legend: {
                data: payType
            },
            grid: {
                left: '3%',
                right: '4%',
                bottom: '3%',
                containLabel: true
            },
            xAxis: {
                type: 'value'
            },
            yAxis: {
                type: 'category',
                data: dateList
            },
            series: [{
                    name: '微信',
                    type: 'bar',
                    stack: '总量',
                    label: {
                        normal: {
                            show: true,
                            position: 'insideRight'
                        }
                    },
                    data: weChatData
                },
                {
                    name: '支付宝',
                    type: 'bar',
                    stack: '总量',
                    label: {
                        normal: {
                            show: true,
                            position: 'insideRight'
                        }
                    },
                    data: aliPayData
                },
                {
                    name: '百度钱包',
                    type: 'bar',
                    stack: '总量',
                    label: {
                        normal: {
                            show: true,
                            position: 'insideRight'
                        }
                    },
                    data: baiduPayData
                },
                {
                    name: '京东钱包',
                    type: 'bar',
                    stack: '总量',
                    label: {
                        normal: {
                            show: true,
                            position: 'insideRight'
                        }
                    },
                    data: jdPayData
                },
                {
                    name: '翼支付',
                    type: 'bar',
                    stack: '总量',
                    label: {
                        normal: {
                            show: true,
                            position: 'insideRight'
                        }
                    },
                    data: bestPayData
                },
                {
                    name: '现金',
                    type: 'bar',
                    stack: '总量',
                    label: {
                        normal: {
                            show: true,
                            position: 'insideRight'
                        }
                    },
                    data: cashData
                }
            ]
        };


        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
        $(document).ready(function () {
            //$('.combobox').combobox();
            $('#config-text').keyup(function () {
                eval($(this).val());
            });
            $('.configurator input, .configurator select').change(function () {
                updateConfig();
            });

            $('.demo i').click(function () {
                $(this).parent().find('input').click();
            });



            updateConfig();

            function updateConfig() {
                var options = {};

                $('#config-demo').daterangepicker(options, function (start, end, label) {
                    console.log('New date range selected: ' + start.format('YYYY-MM-DD') + ' to ' + end
                        .format('YYYY-MM-DD') + ' (predefined range: ' + label + ')');
                });

            }

        });
    </script>
</body>

</html>