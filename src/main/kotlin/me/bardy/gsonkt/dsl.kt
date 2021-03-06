/*
 * This file is part of GsonKt, licensed under the MIT license.
 *
 * Copyright (C) 2021 Callum Seabrook
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
@file:JvmMultifileClass
@file:JvmName("GsonKt")
package me.bardy.gsonkt

import com.google.gson.Gson
import com.google.gson.GsonBuilder

@DslMarker
public annotation class GsonDsl

/**
 * Construct a new [Gson] instance using the provided [builder].
 *
 * @param builder the builder to build from
 * @return a built [Gson] instance
 * @since 1.0
 */
@GsonDsl
public inline fun gson(builder: GsonBuilder.() -> Unit): Gson = GsonBuilder().apply(builder).create()

/**
 * Construct a new [Gson] instance using this [Gson] instance's current values and the provided [builder].
 *
 * @param builder the builder to build from
 * @return a built [Gson] instance based on this [Gson] instance
 * @since 1.1
 */
public fun Gson.newBuilder(builder: GsonBuilder.() -> Unit): Gson = newBuilder().apply(builder).create()
