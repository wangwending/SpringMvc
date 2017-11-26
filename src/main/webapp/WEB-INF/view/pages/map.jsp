<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>华润万象城销售额监控</title>
    <!-- 引入 echarts.js -->
    <script type="text/javascript" src="../js/echarts/echarts.js"></script>
    <script type="text/javascript" src="../js/map/china.js"></script>
</head>

<body>
    <div id="main" style="width: 1340px;height:620px;">
    </div>
    </div>
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));

        var data = [{
                name: '深圳万象城',
                value: 10
            },
            {
                name: '杭州万象城',
                value: 30
            },
            {
                name: '沈阳万象城',
                value: 40
            },
            {
                name: '成都万象城',
                value: 800
            },
            {
                name: '南宁万象城',
                value: 100
            },
            {
                name: '郑州万象城',
                value: 120
            },
            {
                name: '重庆万象城',
                value: 140
            },
            {
                name: '无锡万象城',
                value: 150
            },
            {
                name: '青岛万象城',
                value: 180
            },
            {
                name: '合肥万象城',
                value: 200
            },
            {
                name: '上海万象城',
                value: 220
            },
            {
                name: '泰州万象城',
                value: 250
            },
            {
                name: '赣州万象城',
                value: 280
            },
            {
                name: '西安万象城',
                value: 300
            },
            {
                name: '温州万象城',
                value: 330
            },
            {
                name: '南通万象城',
                value: 350
            },
            {
                name: '太原万象城',
                value: 380
            },
            {
                name: '济南万象城',
                value: 400
            },
            {
                name: '厦门万象城',
                value: 430
            },
            {
                name: '深圳万象天地',
                value: 450
            },
            {
                name: '柳州万象城',
                value: 480
            },
            {
                name: '柳州万象城',
                value: 500
            },
            {
                name: '汕头万象城',
                value: 250
            },
            {
                name: '福州万象城',
                value: 260
            },
            {
                name: '南京万象城',
                value: 260
            },
            {
                name: '宁波万象城',
                value: 260
            },
            {
                name: '北京凤凰汇购物中心',
                value: 30
            },
            {
                name: '北京五彩城',
                value: 500
            },
            {
                name: '合肥五彩城',
                value: 270
            }
        ];
        var geoCoordMap = {
            '深圳万象城': [114.117273, 22.54595],
            '杭州万象城': [120.223351, 30.25958],
            '沈阳万象城': [123.44103, 41.782161],
            '成都万象城': [104.121781, 30.655572],
            '南宁万象城': [108.39957, 22.818048],
            '郑州万象城': [113.668557, 34.760911],
            '重庆万象城': [106.52483, 29.522545],
            '无锡万象城': [120.28939, 31.519231],
            '青岛万象城': [120.384244, 36.072959],
            '合肥万象城': [117.238204, 31.805238],
            '上海万象城': [121.506377, 31.245105],
            '泰州万象城': [119.916592, 32.482401],
            '赣州万象城': [114.936661, 25.836919],
            '西安万象城': [108.834638, 34.297374],
            '温州万象城': [120.692559, 27.957801],
            '南通万象城': [120.861315, 32.060172],
            '太原万象城': [112.536752, 37.814587],
            '济南万象城': [112.536752, 37.814587],
            '厦门万象城': [118.11921, 24.47778],
            '深圳万象天地': [113.96246, 22.547691],
            '柳州万象城': [109.427154, 24.331782],
            '石家庄万象城': [114.485656, 38.047166],
            '汕头万象城': [116.686439, 23.360616],
            '福州万象城': [119.284252, 26.081298],
            '南京万象城': [121.457085, 37.484041],
            '宁波万象城': [121.567541, 29.906156],
            '北京凤凰汇购物中心': [116.463547, 39.968681],
            '北京五彩城': [116.340898, 40.035764],
            '合肥五彩城': [117.257186, 31.835828]
        };


        var convertData = function (data) {
            var res = [];
            for (var i = 0; i < data.length; i++) {
                var geoCoord = geoCoordMap[data[i].name];
                if (geoCoord) {
                    res.push({
                        name: data[i].name,
                        value: geoCoord.concat(data[i].value)
                    });
                }
            }
            return res;
        };

        option = {
            backgroundColor: '#404a59',
            title: {
                text: '华润万象城销售额监控',
                subtext: '华润置地',
                x: 'center',
                textStyle: {
                    color: '#fff'
                }
            },
            tooltip: {
                trigger: 'item',
                formatter: function (params) {
                    return params.name + ' : ' + params.value[2]+'万元';
                }
            },
            legend: {
                orient: 'vertical',
                y: 'bottom',
                x: 'right',
                data: ['交易额'],
                textStyle: {
                    color: '#fff'
                }
            },
            visualMap: {
                min: 0,
                max: 1000,
                splitNumber: 5,
                color: ['#d94e5d', '#eac736', '#50a3ba'],
                textStyle: {
                    color: '#fff'
                }
            },
            geo: {
                map: 'china',
                label: {
                    emphasis: {
                        show: true
                    }
                },
                itemStyle: {
                    normal: {
                        areaColor: '#323c48',
                        borderColor: '#111'
                    },
                    emphasis: {
                        areaColor: '#2a333d'
                    }
                }
            },
            series: [{
                    name: '交易额',
                    type: 'scatter',
                    coordinateSystem: 'geo',
                    data: convertData(data),
                    symbolSize: 15,
                    label: {
                        normal: {
                            show: false
                        },
                        emphasis: {
                            show: false
                        }
                    },
                    itemStyle: {
                        emphasis: {
                            borderColor: '#fff',
                            borderWidth: 1
                        }
                    }
                },
                {
                    name: 'Top 10',
                    type: 'effectScatter',
                    coordinateSystem: 'geo',
                    data: convertData(data.sort(function (a, b) {
                        return b.value - a.value;
                    }).slice(0, 11)), //top 10
                    symbolSize: function (val) {
                        return val[2] / 20;
                    },
                    showEffectOn: 'render',
                    rippleEffect: {
                        brushType: 'stroke'
                    },
                    hoverAnimation: true,
                    label: {
                        normal: {
                            formatter: '{b}',
                            position: 'right',
                            show: true
                        }
                    },
                    itemStyle: {
                        normal: {
                            color: '#f4e925',
                            shadowBlur: 10,
                            shadowColor: '#333'
                        }
                    },
                    zlevel: 1
                }
            ]
        };
       
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
        $(document).ready(function () {
            
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