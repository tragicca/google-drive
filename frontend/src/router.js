
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import DriveFileInfoManager from "./components/listers/DriveFileInfoCards"
import DriveFileInfoDetail from "./components/listers/DriveFileInfoDetail"

import IndexerIndexedFileManager from "./components/listers/IndexerIndexedFileCards"
import IndexerIndexedFileDetail from "./components/listers/IndexerIndexedFileDetail"

import NotificationNoficationInfoManager from "./components/listers/NotificationNoficationInfoCards"
import NotificationNoficationInfoDetail from "./components/listers/NotificationNoficationInfoDetail"


import VideoProcessingVideoFileInfoManager from "./components/listers/VideoProcessingVideoFileInfoCards"
import VideoProcessingVideoFileInfoDetail from "./components/listers/VideoProcessingVideoFileInfoDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/drives/fileInfos',
                name: 'DriveFileInfoManager',
                component: DriveFileInfoManager
            },
            {
                path: '/drives/fileInfos/:id',
                name: 'DriveFileInfoDetail',
                component: DriveFileInfoDetail
            },

            {
                path: '/indexers/indexedFiles',
                name: 'IndexerIndexedFileManager',
                component: IndexerIndexedFileManager
            },
            {
                path: '/indexers/indexedFiles/:id',
                name: 'IndexerIndexedFileDetail',
                component: IndexerIndexedFileDetail
            },

            {
                path: '/notifications/noficationInfos',
                name: 'NotificationNoficationInfoManager',
                component: NotificationNoficationInfoManager
            },
            {
                path: '/notifications/noficationInfos/:id',
                name: 'NotificationNoficationInfoDetail',
                component: NotificationNoficationInfoDetail
            },


            {
                path: '/videoProcessings/videoFileInfos',
                name: 'VideoProcessingVideoFileInfoManager',
                component: VideoProcessingVideoFileInfoManager
            },
            {
                path: '/videoProcessings/videoFileInfos/:id',
                name: 'VideoProcessingVideoFileInfoDetail',
                component: VideoProcessingVideoFileInfoDetail
            },



    ]
})
