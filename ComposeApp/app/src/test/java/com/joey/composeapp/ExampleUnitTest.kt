package com.joey.composeapp

import com.joey.composeapp.data.entity.MatchPageDataResponse
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun jsonTest() {
        val json = """
            {
                "msg": "ok",
                "code": "0",
                "data": {
                    "total": 314,
                    "totalPage": 16,
                    "notopList": [
                        {
                            "matchtime_en": "Nov 15, 2024 14:10:0 PM",
                            "ouzhi_jishi": "41,23,1.01",
                            "hteam_red": 0,
                            "type": 1,
                            "score": "1-3",
                            "zd_level": "1",
                            "status_up": 4,
                            "video_url": "",
                            "id": 4241654,
                            "ateam_logo": "https://cdn.sportnanoapi.com/football/team/e3b4de75987ac3cc7f5fb1c941c957dd.png",
                            "hteam_name": "斯科斯特",
                            "jiaoqiu": "2-2",
                            "yazhi_jishi": "0.82,0,0.97",
                            "is_zd": "0",
                            "level": 4,
                            "hteam_id": 49740,
                            "daxiao_jishi": "41,23,1.01",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/football/competition/89dc5f9be04e4087c6796d21db03be8c.png",
                            "live_cartoon_url": [],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107600831617464542366",
                                    "name": "老6",
                                    "index": 0,
                                    "live_user_name": "18999614562",
                                    "id": "487169",
                                    "url": "https://zbpull3.hblianbei.com/live/107600831617464542366.m3u8",
                                    "seq": 0,
                                    "status": 1
                                }
                            ],
                            "hteam_yellow": 1,
                            "ateam_red": 0,
                            "banchang": "0-1",
                            "ateam_yellow": 1,
                            "cur_round": 0,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107600831617464542366",
                                    "name": "老6",
                                    "index": 0,
                                    "live_user_name": "18999614562",
                                    "id": "487169",
                                    "url": "https://zbpull3.hblianbei.com/live/107600831617464542366.m3u8",
                                    "seq": 0,
                                    "status": 1
                                }
                            ],
                            "ateam_id": 49509,
                            "matchtime": "2024-11-15 14:10:00",
                            "status_up_name": "下半场",
                            "name": "印孟超",
                            "ateam_name": "萨尔塞特",
                            "time": "86",
                            "hteam_logo": "https://cdn.sportnanoapi.com/football/team/1eddfc788271ff07aca04b33dae1196a.png",
                            "cid": 4408,
                            "status": 0,
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107600831617464542366",
                                    "name": "老6",
                                    "index": 0,
                                    "live_user_name": "18999614562",
                                    "id": "487169",
                                    "url": "https://zbpull3.hblianbei.com/live/107600831617464542366.m3u8",
                                    "seq": 0,
                                    "status": 1
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 14:30:0 PM",
                            "ouzhi_jishi": "1.02,21,51",
                            "hteam_red": 0,
                            "type": 1,
                            "score": "5-1",
                            "zd_level": "1",
                            "status_up": 4,
                            "video_url": "",
                            "id": 4226300,
                            "ateam_logo": "https://cdn.sportnanoapi.com/football/team/d1ac549dbfdec4a0d49baec903648bb4.jpg",
                            "hteam_name": "新西兰",
                            "jiaoqiu": "0-0",
                            "yazhi_jishi": "0.97,4.25,0.87",
                            "is_zd": "0",
                            "level": 4,
                            "hteam_id": 14400,
                            "daxiao_jishi": "1.02,21,51",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/football/competition/8bb068f19c99af99b7d202ed5c204926.png",
                            "live_cartoon_url": [],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107575758457815970793",
                                    "name": "阿峰",
                                    "index": 0,
                                    "live_user_name": "18000000177",
                                    "id": "486803",
                                    "url": "https://zbpull3.hblianbei.com/live/107575758457815970793.m3u8",
                                    "seq": 0,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_30600.m3u8",
                                    "seq": 1,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6MtM8trjKxVQJXmBSN.m3u8",
                                    "seq": 2,
                                    "status": 1
                                }
                            ],
                            "hteam_yellow": 0,
                            "ateam_red": 0,
                            "banchang": "5-1",
                            "ateam_yellow": 0,
                            "cur_round": 0,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107575758457815970793",
                                    "name": "阿峰",
                                    "index": 0,
                                    "live_user_name": "18000000177",
                                    "id": "486803",
                                    "url": "https://zbpull3.hblianbei.com/live/107575758457815970793.m3u8",
                                    "seq": 0,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_30600.m3u8",
                                    "seq": 1,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6MtM8trjKxVQJXmBSN.m3u8",
                                    "seq": 2,
                                    "status": 1
                                }
                            ],
                            "ateam_id": 21956,
                            "matchtime": "2024-11-15 14:30:00",
                            "status_up_name": "下半场",
                            "name": "世大洋预",
                            "ateam_name": "瓦努阿图",
                            "time": "68",
                            "hteam_logo": "https://cdn.sportnanoapi.com/football/team/fc14ea837f002ed47a9d8805b3e7fb11.png",
                            "cid": 8,
                            "status": 0,
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107575758457815970793",
                                    "name": "阿峰",
                                    "index": 0,
                                    "live_user_name": "18000000177",
                                    "id": "486803",
                                    "url": "https://zbpull3.hblianbei.com/live/107575758457815970793.m3u8",
                                    "seq": 0,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_30600.m3u8",
                                    "seq": 1,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6MtM8trjKxVQJXmBSN.m3u8",
                                    "seq": 2,
                                    "status": 1
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 14:30:0 PM",
                            "ouzhi_jishi": "1,0,16",
                            "type": 2,
                            "score": "84-69",
                            "zd_level": "1",
                            "status_up": 8,
                            "video_url": "",
                            "id": 3805269,
                            "ateam_logo": "https://cdn.sportnanoapi.com/basketball/team/0f9e6decff9a20de8815cae8ea4e1bb8.png",
                            "hteam_name": "大陆普瓦凯女篮",
                            "yazhi_jishi": "0.83,14.5,0.83",
                            "is_zd": "0",
                            "level": 4,
                            "hteam_id": 38315,
                            "daxiao_jishi": "1,0,16",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/basketball/competition/eb8d6ecb819ebd6e1ccc9ac195b42181.png",
                            "live_cartoon_url": [],
                            "away_score_xiaojie": [
                                20,
                                24,
                                15,
                                10,
                                0
                            ],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107644700523650164650",
                                    "name": "月月",
                                    "index": 0,
                                    "live_user_name": "13816621277",
                                    "id": "487205",
                                    "url": "https://zbpull3.hblianbei.com/live/107644700523650164650.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_33820.m3u8",
                                    "seq": 1,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6wWkp5n1cBzQj1p5uQ.m3u8",
                                    "seq": 2,
                                    "status": 1
                                }
                            ],
                            "cur_round": 1684,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107644700523650164650",
                                    "name": "月月",
                                    "index": 0,
                                    "live_user_name": "13816621277",
                                    "id": "487205",
                                    "url": "https://zbpull3.hblianbei.com/live/107644700523650164650.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_33820.m3u8",
                                    "seq": 1,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6wWkp5n1cBzQj1p5uQ.m3u8",
                                    "seq": 2,
                                    "status": 1
                                }
                            ],
                            "ateam_id": 38324,
                            "matchtime": "2024-11-15 14:30:00",
                            "status_up_name": "第四节",
                            "name": "新西兰女联",
                            "ateam_name": "陶兰加怀伊女篮",
                            "time": "04:29",
                            "hteam_logo": "https://cdn.sportnanoapi.com/basketball/team/55a34103e311f9131150b1b21af83ae6.png",
                            "cid": 4045,
                            "status": 0,
                            "home_score_xiaojie": [
                                28,
                                25,
                                20,
                                11,
                                0
                            ],
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107644700523650164650",
                                    "name": "月月",
                                    "index": 0,
                                    "live_user_name": "13816621277",
                                    "id": "487205",
                                    "url": "https://zbpull3.hblianbei.com/live/107644700523650164650.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_33820.m3u8",
                                    "seq": 1,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6wWkp5n1cBzQj1p5uQ.m3u8",
                                    "seq": 2,
                                    "status": 1
                                }
                            ]
                        }
                    ],
                    "dataList": [
                        {
                            "matchtime_en": "Nov 15, 2024 16:30:0 PM",
                            "ouzhi_jishi": "1.48,0,2.65",
                            "type": 2,
                            "score": "0-0",
                            "zd_level": "1",
                            "status_up": 1,
                            "video_url": "",
                            "id": 3791746,
                            "ateam_logo": "https://cdn.sportnanoapi.com/basketball/team/a4fa72e714131415526de35f1cee3920.png",
                            "hteam_name": "塔斯马尼亚跳伞蚁",
                            "yazhi_jishi": "0.91,4.5,0.91",
                            "is_zd": "0",
                            "level": 2,
                            "hteam_id": 36651,
                            "daxiao_jishi": "1.48,0,2.65",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/basketball/competition/75ea0c3c22789700eeaf2c8047450d82.png",
                            "live_cartoon_url": [],
                            "away_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576664806732599971",
                                    "name": "老默",
                                    "index": 0,
                                    "live_user_name": "18000000139",
                                    "id": "486822",
                                    "url": "https://zbpull3.hblianbei.com/live/107576664806732599971.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_6680.m3u8",
                                    "seq": 1,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6wo8oPWGWUjQRkUX7C.m3u8",
                                    "seq": 2,
                                    "status": 0
                                }
                            ],
                            "cur_round": 1698,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576664806732599971",
                                    "name": "老默",
                                    "index": 0,
                                    "live_user_name": "18000000139",
                                    "id": "486822",
                                    "url": "https://zbpull3.hblianbei.com/live/107576664806732599971.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_6680.m3u8",
                                    "seq": 1,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6wo8oPWGWUjQRkUX7C.m3u8",
                                    "seq": 2,
                                    "status": 0
                                }
                            ],
                            "ateam_id": 10657,
                            "matchtime": "2024-11-15 16:30:00",
                            "status_up_name": "未开赛",
                            "name": "NBL",
                            "ateam_name": "布里斯班子弹",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/basketball/team/5bb229debebf925ddf93351301f54b40.png",
                            "cid": 4,
                            "status": 1,
                            "home_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576664806732599971",
                                    "name": "老默",
                                    "index": 0,
                                    "live_user_name": "18000000139",
                                    "id": "486822",
                                    "url": "https://zbpull3.hblianbei.com/live/107576664806732599971.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_6680.m3u8",
                                    "seq": 1,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6wo8oPWGWUjQRkUX7C.m3u8",
                                    "seq": 2,
                                    "status": 0
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 16:30:0 PM",
                            "ouzhi_jishi": "5.5,0,1.14",
                            "type": 2,
                            "score": "0-0",
                            "zd_level": "1",
                            "status_up": 1,
                            "video_url": "",
                            "id": 3820248,
                            "ateam_logo": "https://cdn.sportnanoapi.com/basketball/team/1125281dafbf06dad029825221e83d5a.png",
                            "hteam_name": "宁波町渥",
                            "yazhi_jishi": "0.91,-10.5,0.83",
                            "is_zd": "0",
                            "level": 4,
                            "hteam_id": 36563,
                            "daxiao_jishi": "5.5,0,1.14",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/basketball/competition/d1adbec11a2a71c1e0022c1ea2df92a9.png",
                            "live_cartoon_url": [],
                            "away_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576642170411466928",
                                    "name": "久久",
                                    "index": 0,
                                    "live_user_name": "18000000172",
                                    "id": "486820",
                                    "url": "https://zbpull3.hblianbei.com/live/107576642170411466928.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_36240.m3u8",
                                    "seq": 1,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6wWmJgNnDLK8rvryYA.m3u8",
                                    "seq": 2,
                                    "status": 0
                                }
                            ],
                            "cur_round": 1792,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576642170411466928",
                                    "name": "久久",
                                    "index": 0,
                                    "live_user_name": "18000000172",
                                    "id": "486820",
                                    "url": "https://zbpull3.hblianbei.com/live/107576642170411466928.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_36240.m3u8",
                                    "seq": 1,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6wWmJgNnDLK8rvryYA.m3u8",
                                    "seq": 2,
                                    "status": 0
                                }
                            ],
                            "ateam_id": 10731,
                            "matchtime": "2024-11-15 16:30:00",
                            "status_up_name": "未开赛",
                            "name": "CBA杯",
                            "ateam_name": "上海久事",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/basketball/team/9b17d2feb1397b99fa0530fba4c7385b.png",
                            "cid": 4276,
                            "status": 1,
                            "home_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576642170411466928",
                                    "name": "久久",
                                    "index": 0,
                                    "live_user_name": "18000000172",
                                    "id": "486820",
                                    "url": "https://zbpull3.hblianbei.com/live/107576642170411466928.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_36240.m3u8",
                                    "seq": 1,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6wWmJgNnDLK8rvryYA.m3u8",
                                    "seq": 2,
                                    "status": 0
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 18:0:0 PM",
                            "ouzhi_jishi": "1.85,3,4",
                            "hteam_red": 0,
                            "type": 1,
                            "score": "0-0",
                            "zd_level": "1",
                            "status_up": 1,
                            "video_url": "",
                            "id": 4221114,
                            "ateam_logo": "https://cdn.sportnanoapi.com/football/team/db6f9b35497e7692dd2843dbada37c1a.png",
                            "hteam_name": "河静洪领",
                            "jiaoqiu": "0-0",
                            "yazhi_jishi": "0.95,0.5,0.85",
                            "is_zd": "0",
                            "level": 3,
                            "hteam_id": 34402,
                            "daxiao_jishi": "1.85,3,4",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/football/competition/0402fbeb5c375de21ee74f868d2b5f0b.png",
                            "live_cartoon_url": [],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576687092338851161",
                                    "name": "小麦",
                                    "index": 0,
                                    "live_user_name": "18000000171",
                                    "id": "486825",
                                    "url": "https://zbpull3.hblianbei.com/live/107576687092338851161.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ],
                            "hteam_yellow": 0,
                            "ateam_red": 0,
                            "banchang": "0-0",
                            "ateam_yellow": 0,
                            "cur_round": 8,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576687092338851161",
                                    "name": "小麦",
                                    "index": 0,
                                    "live_user_name": "18000000171",
                                    "id": "486825",
                                    "url": "https://zbpull3.hblianbei.com/live/107576687092338851161.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ],
                            "ateam_id": 13545,
                            "matchtime": "2024-11-15 18:00:00",
                            "status_up_name": "未开赛",
                            "name": "越南联",
                            "ateam_name": "黄英嘉莱",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/football/team/83dd94c5ca68e8f9a3980f036afcb511.png",
                            "cid": 687,
                            "status": 1,
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576687092338851161",
                                    "name": "小麦",
                                    "index": 0,
                                    "live_user_name": "18000000171",
                                    "id": "486825",
                                    "url": "https://zbpull3.hblianbei.com/live/107576687092338851161.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 18:0:0 PM",
                            "ouzhi_jishi": "2.05,3.2,3.3",
                            "hteam_red": 0,
                            "type": 1,
                            "score": "0-0",
                            "zd_level": "2",
                            "status_up": 1,
                            "video_url": "",
                            "id": 4068503,
                            "ateam_logo": "https://cdn.sportnanoapi.com/football/team/e6baf08c5cdf6b6dfcc1f307dd92905f.png",
                            "hteam_name": "FC大阪",
                            "jiaoqiu": "0-0",
                            "yazhi_jishi": "0.8,0.25,1",
                            "is_zd": 0,
                            "level": 4,
                            "hteam_id": 31922,
                            "daxiao_jishi": "2.05,3.2,3.3",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/football/competition/a1f1648054ac32596f2e18db095c52b4.png",
                            "live_cartoon_url": [],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107591745623092576799",
                                    "name": "小熊",
                                    "index": 0,
                                    "live_user_name": "13359279742",
                                    "id": "487140",
                                    "url": "https://zbpull3.hblianbei.com/live/107591745623092576799.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_28080.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ],
                            "hteam_yellow": 0,
                            "ateam_red": 0,
                            "banchang": "0-0",
                            "ateam_yellow": 0,
                            "cur_round": 37,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107591745623092576799",
                                    "name": "小熊",
                                    "index": 0,
                                    "live_user_name": "13359279742",
                                    "id": "487140",
                                    "url": "https://zbpull3.hblianbei.com/live/107591745623092576799.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_28080.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ],
                            "ateam_id": 29963,
                            "matchtime": "2024-11-15 18:00:00",
                            "status_up_name": "未开赛",
                            "name": "日职丙",
                            "ateam_name": "SC相模原",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/football/team/df5c70d45e8e013f82e098da8d134134.png",
                            "cid": 572,
                            "status": 1,
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107591745623092576799",
                                    "name": "小熊",
                                    "index": 0,
                                    "live_user_name": "13359279742",
                                    "id": "487140",
                                    "url": "https://zbpull3.hblianbei.com/live/107591745623092576799.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_28080.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 18:0:0 PM",
                            "ouzhi_jishi": "2.1,3.1,3.25",
                            "hteam_red": 0,
                            "type": 1,
                            "score": "0-0",
                            "zd_level": "2",
                            "status_up": 1,
                            "video_url": "",
                            "id": 4221115,
                            "ateam_logo": "https://cdn.sportnanoapi.com/football/team/7f95b001711ce3978d498602e1d2c9fd.png",
                            "hteam_name": "广南",
                            "jiaoqiu": "0-0",
                            "yazhi_jishi": "0.85,0.25,0.95",
                            "is_zd": 0,
                            "level": 3,
                            "hteam_id": 13052,
                            "daxiao_jishi": "2.1,3.1,3.25",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/football/competition/0402fbeb5c375de21ee74f868d2b5f0b.png",
                            "live_cartoon_url": [],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107591885788424480151",
                                    "name": "福宝",
                                    "index": 0,
                                    "live_user_name": "15584555583",
                                    "id": "487143",
                                    "url": "https://zbpull3.hblianbei.com/live/107591885788424480151.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ],
                            "hteam_yellow": 0,
                            "ateam_red": 0,
                            "banchang": "0-0",
                            "ateam_yellow": 0,
                            "cur_round": 8,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107591885788424480151",
                                    "name": "福宝",
                                    "index": 0,
                                    "live_user_name": "15584555583",
                                    "id": "487143",
                                    "url": "https://zbpull3.hblianbei.com/live/107591885788424480151.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ],
                            "ateam_id": 26227,
                            "matchtime": "2024-11-15 18:00:00",
                            "status_up_name": "未开赛",
                            "name": "越南联",
                            "ateam_name": "宋兰义安",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/football/team/2b2b28e6c4df2ae30a8b8eb02570a7b6.png",
                            "cid": 687,
                            "status": 1,
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107591885788424480151",
                                    "name": "福宝",
                                    "index": 0,
                                    "live_user_name": "15584555583",
                                    "id": "487143",
                                    "url": "https://zbpull3.hblianbei.com/live/107591885788424480151.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 18:0:0 PM",
                            "ouzhi_jishi": "",
                            "hteam_red": 0,
                            "type": 1,
                            "score": "0-0",
                            "zd_level": "1",
                            "status_up": 1,
                            "video_url": "",
                            "id": 4241327,
                            "ateam_logo": "https://cdn.sportnanoapi.com/football/team/f6d678cad4ca90ebbef758f0b9429737.png",
                            "hteam_name": "土耳其U19",
                            "jiaoqiu": "0-0",
                            "yazhi_jishi": "",
                            "is_zd": "0",
                            "level": 2,
                            "hteam_id": 21294,
                            "daxiao_jishi": "",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/football/competition/4e7c9460ee862d47c2ce6debfef6aace.png",
                            "live_cartoon_url": [],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107591415549096125194",
                                    "name": "卡卡",
                                    "index": 0,
                                    "live_user_name": "18800001008",
                                    "id": "487131",
                                    "url": "https://zbpull3.hblianbei.com/live/107591415549096125194.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ],
                            "hteam_yellow": 0,
                            "ateam_red": 0,
                            "banchang": "0-0",
                            "ateam_yellow": 0,
                            "cur_round": 0,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107591415549096125194",
                                    "name": "卡卡",
                                    "index": 0,
                                    "live_user_name": "18800001008",
                                    "id": "487131",
                                    "url": "https://zbpull3.hblianbei.com/live/107591415549096125194.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ],
                            "ateam_id": 17979,
                            "matchtime": "2024-11-15 18:00:00",
                            "status_up_name": "未开赛",
                            "name": "国际友谊",
                            "ateam_name": "瑞士U19",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/football/team/575d24bc798cf2b4dc1e4fa3125850c8.png",
                            "cid": 34,
                            "status": 1,
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107591415549096125194",
                                    "name": "卡卡",
                                    "index": 0,
                                    "live_user_name": "18800001008",
                                    "id": "487131",
                                    "url": "https://zbpull3.hblianbei.com/live/107591415549096125194.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 18:0:0 PM",
                            "ouzhi_jishi": "1.87,0,1.95",
                            "type": 2,
                            "score": "0-0",
                            "zd_level": "1",
                            "status_up": 1,
                            "video_url": "",
                            "id": 3795087,
                            "ateam_logo": "https://cdn.sportnanoapi.com/basketball/team/ec7668c871d5b6749b1e2632dce5d1d5.png",
                            "hteam_name": "清州KB之星女篮",
                            "yazhi_jishi": "0.95,1.5,0.87",
                            "is_zd": "0",
                            "level": 3,
                            "hteam_id": 11143,
                            "daxiao_jishi": "1.87,0,1.95",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/basketball/competition/4e9c38d3348a4a7a33ed282d12145c22.png",
                            "live_cartoon_url": [],
                            "away_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576743833822492601",
                                    "name": "天天",
                                    "index": 0,
                                    "live_user_name": "18000000170",
                                    "id": "486830",
                                    "url": "https://zbpull3.hblianbei.com/live/107576743833822492601.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_36340.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ],
                            "cur_round": 1707,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576743833822492601",
                                    "name": "天天",
                                    "index": 0,
                                    "live_user_name": "18000000170",
                                    "id": "486830",
                                    "url": "https://zbpull3.hblianbei.com/live/107576743833822492601.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_36340.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ],
                            "ateam_id": 12103,
                            "matchtime": "2024-11-15 18:00:00",
                            "status_up_name": "未开赛",
                            "name": "韩女甲",
                            "ateam_name": "富川KEB女篮",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/basketball/team/e094bfd6bb0782436942015703fc54d0.png",
                            "cid": 28,
                            "status": 1,
                            "home_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576743833822492601",
                                    "name": "天天",
                                    "index": 0,
                                    "live_user_name": "18000000170",
                                    "id": "486830",
                                    "url": "https://zbpull3.hblianbei.com/live/107576743833822492601.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_36340.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 18:30:0 PM",
                            "ouzhi_jishi": "1.58,0,2.4",
                            "type": 2,
                            "score": "0-0",
                            "zd_level": "1",
                            "status_up": 1,
                            "video_url": "",
                            "id": 3791894,
                            "ateam_logo": "https://cdn.sportnanoapi.com/basketball/team/fb957ad093d309e8c337aeb83ebe7857.png",
                            "hteam_name": "珀斯野猫",
                            "yazhi_jishi": "0.91,3.5,0.91",
                            "is_zd": "0",
                            "level": 2,
                            "hteam_id": 10667,
                            "daxiao_jishi": "1.58,0,2.4",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/basketball/competition/75ea0c3c22789700eeaf2c8047450d82.png",
                            "live_cartoon_url": [],
                            "away_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576769292875229719",
                                    "name": "小鹿",
                                    "index": 0,
                                    "live_user_name": "18000000204",
                                    "id": "486833",
                                    "url": "https://zbpull3.hblianbei.com/live/107576769292875229719.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_29040.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ],
                            "cur_round": 1698,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576769292875229719",
                                    "name": "小鹿",
                                    "index": 0,
                                    "live_user_name": "18000000204",
                                    "id": "486833",
                                    "url": "https://zbpull3.hblianbei.com/live/107576769292875229719.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_29040.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ],
                            "ateam_id": 30219,
                            "matchtime": "2024-11-15 18:30:00",
                            "status_up_name": "未开赛",
                            "name": "NBL",
                            "ateam_name": "东南墨尔本凤凰",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/basketball/team/e3b3e519dafdd9bb41614ddb9f7c0fdf.png",
                            "cid": 4,
                            "status": 1,
                            "home_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576769292875229719",
                                    "name": "小鹿",
                                    "index": 0,
                                    "live_user_name": "18000000204",
                                    "id": "486833",
                                    "url": "https://zbpull3.hblianbei.com/live/107576769292875229719.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_29040.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 18:30:0 PM",
                            "ouzhi_jishi": "1.56,0,2.3",
                            "type": 2,
                            "score": "0-0",
                            "zd_level": "1",
                            "status_up": 1,
                            "video_url": "",
                            "id": 3802526,
                            "ateam_logo": "https://cdn.sportnanoapi.com/basketball/team/bf214db279314ea6bf0a30157002a407.png",
                            "hteam_name": "内斯兹奥纳",
                            "yazhi_jishi": "0.83,3.5,0.83",
                            "is_zd": "0",
                            "level": 3,
                            "hteam_id": 12296,
                            "daxiao_jishi": "1.56,0,2.3",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/basketball/competition/3d858fe19e03080fe8d986250b8811f9.png",
                            "live_cartoon_url": [],
                            "away_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107591467055475482666",
                                    "name": "卡卡",
                                    "index": 0,
                                    "live_user_name": "18800001008",
                                    "id": "487134",
                                    "url": "https://zbpull3.hblianbei.com/live/107591467055475482666.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ],
                            "cur_round": 1759,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107591467055475482666",
                                    "name": "卡卡",
                                    "index": 0,
                                    "live_user_name": "18800001008",
                                    "id": "487134",
                                    "url": "https://zbpull3.hblianbei.com/live/107591467055475482666.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ],
                            "ateam_id": 15747,
                            "matchtime": "2024-11-15 18:30:00",
                            "status_up_name": "未开赛",
                            "name": "以篮超",
                            "ateam_name": "艾罗尼",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/basketball/team/b49aa8b99d0e6c8e8957103a02306188.png",
                            "cid": 12,
                            "status": 1,
                            "home_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107591467055475482666",
                                    "name": "卡卡",
                                    "index": 0,
                                    "live_user_name": "18800001008",
                                    "id": "487134",
                                    "url": "https://zbpull3.hblianbei.com/live/107591467055475482666.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 19:0:0 PM",
                            "ouzhi_jishi": "",
                            "hteam_red": 0,
                            "type": 1,
                            "score": "0-0",
                            "zd_level": "1",
                            "status_up": 1,
                            "video_url": "",
                            "id": 4241200,
                            "ateam_logo": "https://cdn.sportnanoapi.com/football/team/92fea298daada3dbafbb13ebd1d9a04f.png",
                            "hteam_name": "英格兰U18",
                            "jiaoqiu": "0-0",
                            "yazhi_jishi": "",
                            "is_zd": "0",
                            "level": 2,
                            "hteam_id": 12083,
                            "daxiao_jishi": "",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/football/competition/4e7c9460ee862d47c2ce6debfef6aace.png",
                            "live_cartoon_url": [],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107591570932516010255",
                                    "name": "宁宁",
                                    "index": 0,
                                    "live_user_name": "0182112636",
                                    "id": "487137",
                                    "url": "https://zbpull3.hblianbei.com/live/107591570932516010255.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ],
                            "hteam_yellow": 0,
                            "ateam_red": 0,
                            "banchang": "0-0",
                            "ateam_yellow": 0,
                            "cur_round": 0,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107591570932516010255",
                                    "name": "宁宁",
                                    "index": 0,
                                    "live_user_name": "0182112636",
                                    "id": "487137",
                                    "url": "https://zbpull3.hblianbei.com/live/107591570932516010255.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ],
                            "ateam_id": 15690,
                            "matchtime": "2024-11-15 19:00:00",
                            "status_up_name": "未开赛",
                            "name": "国际友谊",
                            "ateam_name": "波兰U18",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/football/team/2da60209f9ebc2d366272f04e47db488.png",
                            "cid": 34,
                            "status": 1,
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107591570932516010255",
                                    "name": "宁宁",
                                    "index": 0,
                                    "live_user_name": "0182112636",
                                    "id": "487137",
                                    "url": "https://zbpull3.hblianbei.com/live/107591570932516010255.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 19:0:0 PM",
                            "ouzhi_jishi": "1.22,4.75,11",
                            "hteam_red": 0,
                            "type": 1,
                            "score": "0-0",
                            "zd_level": "1",
                            "status_up": 1,
                            "video_url": "",
                            "id": 4234053,
                            "ateam_logo": "https://cdn.sportnanoapi.com/football/team/d183acf4e1500de34a9bb72ff77f2ecc.jpg",
                            "hteam_name": "TTBD富东",
                            "jiaoqiu": "0-0",
                            "yazhi_jishi": "1,1.75,0.8",
                            "is_zd": "0",
                            "level": 4,
                            "hteam_id": 38850,
                            "daxiao_jishi": "1.22,4.75,11",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/football/competition/0edff1472edca4aeeec7534f0bceb230.png",
                            "live_cartoon_url": [],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107591173893186578796",
                                    "name": "卡卡",
                                    "index": 0,
                                    "live_user_name": "18800001008",
                                    "id": "487128",
                                    "url": "https://zbpull3.hblianbei.com/live/107591173893186578796.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ],
                            "hteam_yellow": 0,
                            "ateam_red": 0,
                            "banchang": "0-0",
                            "ateam_yellow": 0,
                            "cur_round": 4,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107591173893186578796",
                                    "name": "卡卡",
                                    "index": 0,
                                    "live_user_name": "18800001008",
                                    "id": "487128",
                                    "url": "https://zbpull3.hblianbei.com/live/107591173893186578796.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ],
                            "ateam_id": 33290,
                            "matchtime": "2024-11-15 19:00:00",
                            "status_up_name": "未开赛",
                            "name": "越南甲",
                            "ateam_name": "顺化",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/football/team/a5fe969624b4e240afbd6f425f0fce46.png",
                            "cid": 688,
                            "status": 1,
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107591173893186578796",
                                    "name": "卡卡",
                                    "index": 0,
                                    "live_user_name": "18800001008",
                                    "id": "487128",
                                    "url": "https://zbpull3.hblianbei.com/live/107591173893186578796.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 19:0:0 PM",
                            "ouzhi_jishi": "",
                            "hteam_red": 0,
                            "type": 1,
                            "score": "0-0",
                            "zd_level": "1",
                            "status_up": 1,
                            "video_url": "",
                            "id": 4241201,
                            "ateam_logo": "https://cdn.sportnanoapi.com/football/team/0ec92252689ec8422387f667d4c90912.png",
                            "hteam_name": "沙特阿拉伯U16",
                            "jiaoqiu": "0-0",
                            "yazhi_jishi": "",
                            "is_zd": "0",
                            "level": 2,
                            "hteam_id": 24296,
                            "daxiao_jishi": "",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/football/competition/4e7c9460ee862d47c2ce6debfef6aace.png",
                            "live_cartoon_url": [],
                            "mirror_live_urls": [],
                            "hteam_yellow": 0,
                            "ateam_red": 0,
                            "banchang": "0-0",
                            "ateam_yellow": 0,
                            "cur_round": 0,
                            "live_urls": [],
                            "ateam_id": 24583,
                            "matchtime": "2024-11-15 19:00:00",
                            "status_up_name": "未开赛",
                            "name": "国际友谊",
                            "ateam_name": "韩国U16",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/football/team/b1000d45df8c9dfa072084b8f0bb75b6.png",
                            "cid": 34,
                            "status": 1,
                            "global_live_urls": []
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 19:0:0 PM",
                            "ouzhi_jishi": "1.62,4.33,3.6",
                            "hteam_red": 0,
                            "type": 1,
                            "score": "0-0",
                            "zd_level": "1",
                            "status_up": 1,
                            "video_url": "",
                            "id": 4241209,
                            "ateam_logo": "https://cdn.sportnanoapi.com/football/team/0636fa6adc628b663bad30b92e1aa319.png",
                            "hteam_name": "哈特堡格",
                            "jiaoqiu": "0-0",
                            "yazhi_jishi": "0.83,0.75,0.98",
                            "is_zd": "0",
                            "level": 4,
                            "hteam_id": 14294,
                            "daxiao_jishi": "1.62,4.33,3.6",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/football/competition/2440249cd19586c39de8e05d55cc6b0d.png",
                            "live_cartoon_url": [],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107583242233861493981",
                                    "name": "宁宁",
                                    "index": 0,
                                    "live_user_name": "0182112636",
                                    "id": "487077",
                                    "url": "https://zbpull3.hblianbei.com/live/107583242233861493981.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ],
                            "hteam_yellow": 0,
                            "ateam_red": 0,
                            "banchang": "0-0",
                            "ateam_yellow": 0,
                            "cur_round": 0,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107583242233861493981",
                                    "name": "宁宁",
                                    "index": 0,
                                    "live_user_name": "0182112636",
                                    "id": "487077",
                                    "url": "https://zbpull3.hblianbei.com/live/107583242233861493981.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ],
                            "ateam_id": 16460,
                            "matchtime": "2024-11-15 19:00:00",
                            "status_up_name": "未开赛",
                            "name": "球会友谊",
                            "ateam_name": "第一维也纳",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/football/team/a261990c8ba568a176fbac7ad0f01c12.png",
                            "cid": 24,
                            "status": 1,
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107583242233861493981",
                                    "name": "宁宁",
                                    "index": 0,
                                    "live_user_name": "0182112636",
                                    "id": "487077",
                                    "url": "https://zbpull3.hblianbei.com/live/107583242233861493981.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 19:0:0 PM",
                            "ouzhi_jishi": "1.48,0,2.55",
                            "type": 2,
                            "score": "0-0",
                            "zd_level": "1",
                            "status_up": 1,
                            "video_url": "",
                            "id": 3802430,
                            "ateam_logo": "https://cdn.sportnanoapi.com/basketball/team/57c84fa9e72d497581bbab45d8fdbd0b.png",
                            "hteam_name": "基利波加利尔",
                            "yazhi_jishi": "0.83,4.5,0.83",
                            "is_zd": "0",
                            "level": 3,
                            "hteam_id": 10315,
                            "daxiao_jishi": "1.48,0,2.55",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/basketball/competition/3d858fe19e03080fe8d986250b8811f9.png",
                            "live_cartoon_url": [],
                            "away_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107583322991651540284",
                                    "name": "宁宁",
                                    "index": 0,
                                    "live_user_name": "0182112636",
                                    "id": "487080",
                                    "url": "https://zbpull3.hblianbei.com/live/107583322991651540284.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ],
                            "cur_round": 1759,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107583322991651540284",
                                    "name": "宁宁",
                                    "index": 0,
                                    "live_user_name": "0182112636",
                                    "id": "487080",
                                    "url": "https://zbpull3.hblianbei.com/live/107583322991651540284.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ],
                            "ateam_id": 14163,
                            "matchtime": "2024-11-15 19:00:00",
                            "status_up_name": "未开赛",
                            "name": "以篮超",
                            "ateam_name": "海法夏普尔",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/basketball/team/15a3f3a12004f84f91430b57f0f4d9c5.png",
                            "cid": 12,
                            "status": 1,
                            "home_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107583322991651540284",
                                    "name": "宁宁",
                                    "index": 0,
                                    "live_user_name": "0182112636",
                                    "id": "487080",
                                    "url": "https://zbpull3.hblianbei.com/live/107583322991651540284.m3u8",
                                    "seq": 0,
                                    "status": 0
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 19:30:0 PM",
                            "ouzhi_jishi": "1.13,0,5.75",
                            "type": 2,
                            "score": "0-0",
                            "zd_level": "1",
                            "status_up": 1,
                            "video_url": "",
                            "id": 3820254,
                            "ateam_logo": "https://cdn.sportnanoapi.com/basketball/team/03173dab50b9418d1a834a91104d90a4.png",
                            "hteam_name": "青岛国信制药",
                            "yazhi_jishi": "0.8,10.5,0.95",
                            "is_zd": "0",
                            "level": 4,
                            "hteam_id": 10361,
                            "daxiao_jishi": "1.13,0,5.75",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/basketball/competition/d1adbec11a2a71c1e0022c1ea2df92a9.png",
                            "live_cartoon_url": [],
                            "away_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576943972549947981",
                                    "name": "小鱼",
                                    "index": 0,
                                    "live_user_name": "18000000168",
                                    "id": "486846",
                                    "url": "https://zbpull3.hblianbei.com/live/107576943972549947981.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_35440.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ],
                            "cur_round": 1792,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576943972549947981",
                                    "name": "小鱼",
                                    "index": 0,
                                    "live_user_name": "18000000168",
                                    "id": "486846",
                                    "url": "https://zbpull3.hblianbei.com/live/107576943972549947981.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_35440.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ],
                            "ateam_id": 10728,
                            "matchtime": "2024-11-15 19:30:00",
                            "status_up_name": "未开赛",
                            "name": "CBA杯",
                            "ateam_name": "辽宁本钢",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/basketball/team/8265cde14b18d7e3716bb1e0b0aed623.png",
                            "cid": 4276,
                            "status": 1,
                            "home_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576943972549947981",
                                    "name": "小鱼",
                                    "index": 0,
                                    "live_user_name": "18000000168",
                                    "id": "486846",
                                    "url": "https://zbpull3.hblianbei.com/live/107576943972549947981.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_35440.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 19:30:0 PM",
                            "ouzhi_jishi": "",
                            "type": 2,
                            "score": "0-0",
                            "zd_level": "2",
                            "status_up": 1,
                            "video_url": "",
                            "id": 3820631,
                            "ateam_logo": "https://cdn.sportnanoapi.com/basketball/team/31cb7287295a89750e0489d65325d7e4.png",
                            "hteam_name": "四川远达女篮",
                            "yazhi_jishi": "",
                            "is_zd": 0,
                            "level": 2,
                            "hteam_id": 12469,
                            "daxiao_jishi": "",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/basketball/competition/e81a1f1ea712803cd465de7a3cca09f6.png",
                            "live_cartoon_url": [],
                            "away_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107583397578508753490",
                                    "name": "朵咪",
                                    "index": 0,
                                    "live_user_name": "13943327861",
                                    "id": "487083",
                                    "url": "https://zbpull3.hblianbei.com/live/107583397578508753490.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_8680.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ],
                            "cur_round": 1791,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107583397578508753490",
                                    "name": "朵咪",
                                    "index": 0,
                                    "live_user_name": "13943327861",
                                    "id": "487083",
                                    "url": "https://zbpull3.hblianbei.com/live/107583397578508753490.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_8680.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ],
                            "ateam_id": 10202,
                            "matchtime": "2024-11-15 19:30:00",
                            "status_up_name": "未开赛",
                            "name": "WCBA",
                            "ateam_name": "江苏南钢女篮",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/basketball/team/762193981179bd9e412c2f38d2846449.png",
                            "cid": 20,
                            "status": 1,
                            "home_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107583397578508753490",
                                    "name": "朵咪",
                                    "index": 0,
                                    "live_user_name": "13943327861",
                                    "id": "487083",
                                    "url": "https://zbpull3.hblianbei.com/live/107583397578508753490.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_8680.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 19:30:0 PM",
                            "ouzhi_jishi": "1.13,0,6",
                            "type": 2,
                            "score": "0-0",
                            "zd_level": "1",
                            "status_up": 1,
                            "video_url": "",
                            "id": 3820247,
                            "ateam_logo": "https://cdn.sportnanoapi.com/basketball/team/2428a8c17b5a31163b54cb9502998bbf.png",
                            "hteam_name": "深圳马可波罗",
                            "yazhi_jishi": "0.87,11.5,0.87",
                            "is_zd": "0",
                            "level": 4,
                            "hteam_id": 10730,
                            "daxiao_jishi": "1.13,0,6",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/basketball/competition/d1adbec11a2a71c1e0022c1ea2df92a9.png",
                            "live_cartoon_url": [],
                            "away_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576908879651373114",
                                    "name": "红豆",
                                    "index": 0,
                                    "live_user_name": "18000000167",
                                    "id": "486845",
                                    "url": "https://zbpull3.hblianbei.com/live/107576908879651373114.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_35120.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ],
                            "cur_round": 1792,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576908879651373114",
                                    "name": "红豆",
                                    "index": 0,
                                    "live_user_name": "18000000167",
                                    "id": "486845",
                                    "url": "https://zbpull3.hblianbei.com/live/107576908879651373114.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_35120.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ],
                            "ateam_id": 10732,
                            "matchtime": "2024-11-15 19:30:00",
                            "status_up_name": "未开赛",
                            "name": "CBA杯",
                            "ateam_name": "福建晋江文旅",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/basketball/team/fb44eee02df789207dee98898982cc16.png",
                            "cid": 4276,
                            "status": 1,
                            "home_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576908879651373114",
                                    "name": "红豆",
                                    "index": 0,
                                    "live_user_name": "18000000167",
                                    "id": "486845",
                                    "url": "https://zbpull3.hblianbei.com/live/107576908879651373114.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_35120.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 19:30:0 PM",
                            "ouzhi_jishi": "1.48,0,2.65",
                            "type": 2,
                            "score": "0-0",
                            "zd_level": "1",
                            "status_up": 1,
                            "video_url": "",
                            "id": 3820239,
                            "ateam_logo": "https://cdn.sportnanoapi.com/basketball/team/96108e3d2a3cf92f8f5305e5135f2419.png",
                            "hteam_name": "浙江稠州金租",
                            "yazhi_jishi": "0.87,4.5,0.87",
                            "is_zd": "0",
                            "level": 4,
                            "hteam_id": 10722,
                            "daxiao_jishi": "1.48,0,2.65",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/basketball/competition/d1adbec11a2a71c1e0022c1ea2df92a9.png",
                            "live_cartoon_url": [],
                            "away_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576862041462361268",
                                    "name": "冠希",
                                    "index": 0,
                                    "live_user_name": "18000000208",
                                    "id": "486841",
                                    "url": "https://zbpull3.hblianbei.com/live/107576862041462361268.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_34830.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ],
                            "cur_round": 1792,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576862041462361268",
                                    "name": "冠希",
                                    "index": 0,
                                    "live_user_name": "18000000208",
                                    "id": "486841",
                                    "url": "https://zbpull3.hblianbei.com/live/107576862041462361268.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_34830.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ],
                            "ateam_id": 10729,
                            "matchtime": "2024-11-15 19:30:00",
                            "status_up_name": "未开赛",
                            "name": "CBA杯",
                            "ateam_name": "浙江方兴渡",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/basketball/team/d1d77f07287fe840a7e77459e5bd1bfc.png",
                            "cid": 4276,
                            "status": 1,
                            "home_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576862041462361268",
                                    "name": "冠希",
                                    "index": 0,
                                    "live_user_name": "18000000208",
                                    "id": "486841",
                                    "url": "https://zbpull3.hblianbei.com/live/107576862041462361268.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_34830.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 19:30:0 PM",
                            "ouzhi_jishi": "1.48,0,2.65",
                            "type": 2,
                            "score": "0-0",
                            "zd_level": "1",
                            "status_up": 1,
                            "video_url": "",
                            "id": 3820229,
                            "ateam_logo": "https://cdn.sportnanoapi.com/basketball/team/b25897e323bba837824c2d7fead03826.png",
                            "hteam_name": "天津先行者",
                            "yazhi_jishi": "0.87,4.5,0.87",
                            "is_zd": "0",
                            "level": 4,
                            "hteam_id": 10360,
                            "daxiao_jishi": "1.48,0,2.65",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/basketball/competition/d1adbec11a2a71c1e0022c1ea2df92a9.png",
                            "live_cartoon_url": [],
                            "away_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576829187861102277",
                                    "name": "老默",
                                    "index": 0,
                                    "live_user_name": "18000000139",
                                    "id": "486837",
                                    "url": "https://zbpull3.hblianbei.com/live/107576829187861102277.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_35330.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ],
                            "cur_round": 1792,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576829187861102277",
                                    "name": "老默",
                                    "index": 0,
                                    "live_user_name": "18000000139",
                                    "id": "486837",
                                    "url": "https://zbpull3.hblianbei.com/live/107576829187861102277.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_35330.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ],
                            "ateam_id": 10326,
                            "matchtime": "2024-11-15 19:30:00",
                            "status_up_name": "未开赛",
                            "name": "CBA杯",
                            "ateam_name": "江苏肯帝亚",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/basketball/team/ca7a0200923048ff354ddcce89b8f12b.png",
                            "cid": 4276,
                            "status": 1,
                            "home_score_xiaojie": [
                                0,
                                0,
                                0,
                                0,
                                0
                            ],
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576829187861102277",
                                    "name": "老默",
                                    "index": 0,
                                    "live_user_name": "18000000139",
                                    "id": "486837",
                                    "url": "https://zbpull3.hblianbei.com/live/107576829187861102277.m3u8",
                                    "seq": 0,
                                    "status": 0
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_35330.m3u8",
                                    "seq": 1,
                                    "status": 0
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 19:45:0 PM",
                            "ouzhi_jishi": "",
                            "hteam_red": 0,
                            "type": 1,
                            "score": "0-0",
                            "zd_level": "1",
                            "status_up": 1,
                            "video_url": "",
                            "id": 4120774,
                            "ateam_logo": "https://cdn.sportnanoapi.com/football/team/ee46b8edfc2a29f84a7e3c2616055ac6.png",
                            "hteam_name": "狮城水手",
                            "jiaoqiu": "0-0",
                            "yazhi_jishi": "",
                            "is_zd": "0",
                            "level": 3,
                            "hteam_id": 12238,
                            "daxiao_jishi": "",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/football/competition/f673935d115d19fd412bcedf9ac3f936.png",
                            "live_cartoon_url": [],
                            "mirror_live_urls": [],
                            "hteam_yellow": 0,
                            "ateam_red": 0,
                            "banchang": "0-0",
                            "ateam_yellow": 0,
                            "cur_round": 20,
                            "live_urls": [],
                            "ateam_id": 17748,
                            "matchtime": "2024-11-15 19:45:00",
                            "status_up_name": "未开赛",
                            "name": "新加坡联",
                            "ateam_name": "幼狮队",
                            "time": "",
                            "hteam_logo": "https://cdn.sportnanoapi.com/football/team/342495cecb2a38915438b991d26001b9.png",
                            "cid": 632,
                            "status": 1,
                            "global_live_urls": []
                        }
                    ],
                    "topList": [
                        {
                            "matchtime_en": "Nov 15, 2024 15:0:0 PM",
                            "ouzhi_jishi": "6.25,0,1.1",
                            "type": 2,
                            "score": "34-40",
                            "zd_level": "1",
                            "status_up": 5,
                            "video_url": "",
                            "id": 3820226,
                            "ateam_logo": "https://cdn.sportnanoapi.com/basketball/team/559cfc139ec9e214e54b4ddae5d1cba7.png",
                            "hteam_name": "广州朗肽海本",
                            "yazhi_jishi": "0.8,-10.5,0.86",
                            "is_zd": "0",
                            "level": 4,
                            "hteam_id": 10725,
                            "daxiao_jishi": "6.25,0,1.1",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/basketball/competition/d1adbec11a2a71c1e0022c1ea2df92a9.png",
                            "live_cartoon_url": [],
                            "away_score_xiaojie": [
                                23,
                                17,
                                0,
                                0,
                                0
                            ],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107575951278950518595",
                                    "name": "胖龙",
                                    "index": 0,
                                    "live_user_name": "18000000174",
                                    "id": "486805",
                                    "url": "https://zbpull3.hblianbei.com/live/107575951278950518595.m3u8",
                                    "seq": 0,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_39670.m3u8",
                                    "seq": 1,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6wWmJgNoE57wtZPTHp.m3u8",
                                    "seq": 2,
                                    "status": 1
                                }
                            ],
                            "cur_round": 1792,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107575951278950518595",
                                    "name": "胖龙",
                                    "index": 0,
                                    "live_user_name": "18000000174",
                                    "id": "486805",
                                    "url": "https://zbpull3.hblianbei.com/live/107575951278950518595.m3u8",
                                    "seq": 0,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_39670.m3u8",
                                    "seq": 1,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6wWmJgNoE57wtZPTHp.m3u8",
                                    "seq": 2,
                                    "status": 1
                                }
                            ],
                            "ateam_id": 11072,
                            "matchtime": "2024-11-15 15:00:00",
                            "status_up_name": "第二节完",
                            "name": "CBA杯",
                            "ateam_name": "北京控股",
                            "time": "10:00",
                            "hteam_logo": "https://cdn.sportnanoapi.com/basketball/team/858cde8d2c075296f24e7ee61929fbeb.png",
                            "cid": 4276,
                            "status": 0,
                            "home_score_xiaojie": [
                                19,
                                15,
                                0,
                                0,
                                0
                            ],
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107575951278950518595",
                                    "name": "胖龙",
                                    "index": 0,
                                    "live_user_name": "18000000174",
                                    "id": "486805",
                                    "url": "https://zbpull3.hblianbei.com/live/107575951278950518595.m3u8",
                                    "seq": 0,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_39670.m3u8",
                                    "seq": 1,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6wWmJgNoE57wtZPTHp.m3u8",
                                    "seq": 2,
                                    "status": 1
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 15:0:0 PM",
                            "ouzhi_jishi": "17,0,1",
                            "type": 2,
                            "score": "33-58",
                            "zd_level": "1",
                            "status_up": 6,
                            "video_url": "",
                            "id": 3820238,
                            "ateam_logo": "https://cdn.sportnanoapi.com/basketball/team/fd94971d5354c254a48249ad402cfb92.png",
                            "hteam_name": "四川丰谷酒业",
                            "yazhi_jishi": "0.83,-33.5,0.83",
                            "is_zd": "0",
                            "level": 4,
                            "hteam_id": 11380,
                            "daxiao_jishi": "17,0,1",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/basketball/competition/d1adbec11a2a71c1e0022c1ea2df92a9.png",
                            "live_cartoon_url": [],
                            "away_score_xiaojie": [
                                27,
                                31,
                                0,
                                0,
                                0
                            ],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576004445050833863",
                                    "name": "甜瓜",
                                    "index": 0,
                                    "live_user_name": "18000000207",
                                    "id": "486806",
                                    "url": "https://zbpull3.hblianbei.com/live/107576004445050833863.m3u8",
                                    "seq": 0,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_40590.m3u8",
                                    "seq": 1,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6wWmJgNo3qgCu2L1sk.m3u8",
                                    "seq": 2,
                                    "status": 1
                                }
                            ],
                            "cur_round": 1792,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576004445050833863",
                                    "name": "甜瓜",
                                    "index": 0,
                                    "live_user_name": "18000000207",
                                    "id": "486806",
                                    "url": "https://zbpull3.hblianbei.com/live/107576004445050833863.m3u8",
                                    "seq": 0,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_40590.m3u8",
                                    "seq": 1,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6wWmJgNo3qgCu2L1sk.m3u8",
                                    "seq": 2,
                                    "status": 1
                                }
                            ],
                            "ateam_id": 10727,
                            "matchtime": "2024-11-15 15:00:00",
                            "status_up_name": "第三节",
                            "name": "CBA杯",
                            "ateam_name": "山东高速",
                            "time": "10:00",
                            "hteam_logo": "https://cdn.sportnanoapi.com/basketball/team/d80e6d5b1e2d6d989b5c3b7790fe0025.png",
                            "cid": 4276,
                            "status": 0,
                            "home_score_xiaojie": [
                                14,
                                19,
                                0,
                                0,
                                0
                            ],
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576004445050833863",
                                    "name": "甜瓜",
                                    "index": 0,
                                    "live_user_name": "18000000207",
                                    "id": "486806",
                                    "url": "https://zbpull3.hblianbei.com/live/107576004445050833863.m3u8",
                                    "seq": 0,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_40590.m3u8",
                                    "seq": 1,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6wWmJgNo3qgCu2L1sk.m3u8",
                                    "seq": 2,
                                    "status": 1
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 15:0:0 PM",
                            "ouzhi_jishi": "3.75,0,1.23",
                            "type": 2,
                            "score": "43-50",
                            "zd_level": "1",
                            "status_up": 6,
                            "video_url": "",
                            "id": 3820263,
                            "ateam_logo": "https://cdn.sportnanoapi.com/basketball/team/b54ffedd1c9a80374581bb3d7096dba6.png",
                            "hteam_name": "北京北汽",
                            "yazhi_jishi": "0.83,-6.5,0.83",
                            "is_zd": "0",
                            "level": 4,
                            "hteam_id": 10726,
                            "daxiao_jishi": "3.75,0,1.23",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/basketball/competition/d1adbec11a2a71c1e0022c1ea2df92a9.png",
                            "live_cartoon_url": [],
                            "away_score_xiaojie": [
                                27,
                                19,
                                4,
                                0,
                                0
                            ],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107575864571144903713",
                                    "name": "小鹿",
                                    "index": 0,
                                    "live_user_name": "18000000204",
                                    "id": "486804",
                                    "url": "https://zbpull3.hblianbei.com/live/107575864571144903713.m3u8",
                                    "seq": 0,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_37590.m3u8",
                                    "seq": 1,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6wWmJgNnZ5SVJtHSTG.m3u8",
                                    "seq": 2,
                                    "status": 1
                                }
                            ],
                            "cur_round": 1792,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107575864571144903713",
                                    "name": "小鹿",
                                    "index": 0,
                                    "live_user_name": "18000000204",
                                    "id": "486804",
                                    "url": "https://zbpull3.hblianbei.com/live/107575864571144903713.m3u8",
                                    "seq": 0,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_37590.m3u8",
                                    "seq": 1,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6wWmJgNnZ5SVJtHSTG.m3u8",
                                    "seq": 2,
                                    "status": 1
                                }
                            ],
                            "ateam_id": 10724,
                            "matchtime": "2024-11-15 15:00:00",
                            "status_up_name": "第三节",
                            "name": "CBA杯",
                            "ateam_name": "新疆伊力特",
                            "time": "07:09",
                            "hteam_logo": "https://cdn.sportnanoapi.com/basketball/team/6c1517eb77ace7e782d74d34e9154710.png",
                            "cid": 4276,
                            "status": 0,
                            "home_score_xiaojie": [
                                30,
                                11,
                                2,
                                0,
                                0
                            ],
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107575864571144903713",
                                    "name": "小鹿",
                                    "index": 0,
                                    "live_user_name": "18000000204",
                                    "id": "486804",
                                    "url": "https://zbpull3.hblianbei.com/live/107575864571144903713.m3u8",
                                    "seq": 0,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "中文",
                                    "index": 2,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_37590.m3u8",
                                    "seq": 1,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6wWmJgNnZ5SVJtHSTG.m3u8",
                                    "seq": 2,
                                    "status": 1
                                }
                            ]
                        },
                        {
                            "matchtime_en": "Nov 15, 2024 16:0:0 PM",
                            "ouzhi_jishi": "1.33,4.75,6.25",
                            "hteam_red": 0,
                            "type": 1,
                            "score": "0-0",
                            "zd_level": "1",
                            "status_up": 2,
                            "video_url": "",
                            "id": 4230475,
                            "ateam_logo": "https://cdn.sportnanoapi.com/football/team/dcba383672b526b32cc5e2047c0e7722.png",
                            "hteam_name": "布里斯班狮吼女足",
                            "jiaoqiu": "0-0",
                            "yazhi_jishi": "0.97,1.5,0.82",
                            "is_zd": "0",
                            "level": 2,
                            "hteam_id": 27257,
                            "daxiao_jishi": "1.33,4.75,6.25",
                            "zoneIdString": "Asia/Shanghai",
                            "clogo": "https://cdn.sportnanoapi.com/football/competition/3391c527d7cfb37ff6f5c9c05042869b.png",
                            "live_cartoon_url": [],
                            "mirror_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576036505756537578",
                                    "name": "路飞",
                                    "index": 0,
                                    "live_user_name": "18000000201",
                                    "id": "486807",
                                    "url": "https://zbpull3.hblianbei.com/live/107576036505756537578.m3u8",
                                    "seq": 0,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_39460.m3u8",
                                    "seq": 1,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6MtLtQAb4huMxHx58i.m3u8",
                                    "seq": 2,
                                    "status": 1
                                }
                            ],
                            "hteam_yellow": 0,
                            "ateam_red": 0,
                            "banchang": "0-0",
                            "ateam_yellow": 0,
                            "cur_round": 3,
                            "live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576036505756537578",
                                    "name": "路飞",
                                    "index": 0,
                                    "live_user_name": "18000000201",
                                    "id": "486807",
                                    "url": "https://zbpull3.hblianbei.com/live/107576036505756537578.m3u8",
                                    "seq": 0,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_39460.m3u8",
                                    "seq": 1,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6MtLtQAb4huMxHx58i.m3u8",
                                    "seq": 2,
                                    "status": 1
                                }
                            ],
                            "ateam_id": 25155,
                            "matchtime": "2024-11-15 16:00:00",
                            "status_up_name": "上半场",
                            "name": "澳女联",
                            "ateam_name": "珀斯光荣女足",
                            "time": "1",
                            "hteam_logo": "https://cdn.sportnanoapi.com/football/team/d0ab470a523f96ec1837beccb2943083.png",
                            "cid": 602,
                            "status": 0,
                            "global_live_urls": [
                                {
                                    "room_num": 0,
                                    "streamId": "107576036505756537578",
                                    "name": "路飞",
                                    "index": 0,
                                    "live_user_name": "18000000201",
                                    "id": "486807",
                                    "url": "https://zbpull3.hblianbei.com/live/107576036505756537578.m3u8",
                                    "seq": 0,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "高清",
                                    "index": 3,
                                    "url": "https://play1nm.hnyongshun.cn/live/ballbar_39460.m3u8",
                                    "seq": 1,
                                    "status": 1
                                },
                                {
                                    "room_num": -1,
                                    "name": "标清",
                                    "index": 5,
                                    "url": "https://play1nm.hnyongshun.cn/live/sd-6MtLtQAb4huMxHx58i.m3u8",
                                    "seq": 2,
                                    "status": 1
                                }
                            ]
                        }
                    ],
                    "live_type": 0,
                    "starttime": "",
                    "currentPage": 1,
                    "token": "fa3583f9f893dd9cfff005aeb113ec61"
                }
            }
        """.trimIndent()
        val moshi: Moshi = Moshi.Builder().build()
        val jsonAdapter: JsonAdapter<MatchPageDataResponse> = moshi.adapter<MatchPageDataResponse>(MatchPageDataResponse::class.java)

        val data = jsonAdapter.fromJson(json)
        assertNotNull(data)
    }

}