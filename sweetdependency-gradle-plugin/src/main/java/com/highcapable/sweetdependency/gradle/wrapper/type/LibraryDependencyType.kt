/*
 * SweetDependency - An easy autowire and manage dependencies Gradle plugin
 * Copyright (C) 2019-2023 HighCapable
 * https://github.com/HighCapable/SweetDependency
 *
 * Apache License Version 2.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This file is Created by fankes on 2023/6/10.
 */
package com.highcapable.sweetdependency.gradle.wrapper.type

/**
 * 库依赖类型定义类
 */
internal enum class LibraryDependencyType {
    /** 其它类型 */
    OTHERS,

    /** 外部存储库 */
    EXTERNAL,

    /** 外部存储库 (代理) */
    EXTERNAL_DELEGATE,

    /** 项目 */
    PROJECT,

    /** 文件 */
    FILES
}