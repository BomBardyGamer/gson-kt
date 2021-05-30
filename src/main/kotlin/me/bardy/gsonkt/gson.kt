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
import com.google.gson.JsonElement
import com.google.gson.TypeAdapter
import com.google.gson.TypeAdapterFactory
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter
import java.io.Reader

public inline fun <reified T> typeOf(): TypeToken<T> = object : TypeToken<T>() {}

public inline fun <reified T> Gson.getAdapter(): TypeAdapter<T> = getAdapter(typeOf<T>())

public inline fun <reified T> Gson.getDelegateAdapter(skipPast: TypeAdapterFactory): TypeAdapter<T> = getDelegateAdapter(skipPast, typeOf<T>())

public inline fun <reified T> Gson.toJsonTree(src: Any): JsonElement = toJsonTree(src, typeOf<T>().type)

public inline fun <reified T> Gson.toJson(src: Any): String = toJson(src, typeOf<T>().type)

public inline fun <reified T> Gson.toJson(src: Any, writer: Appendable): Unit = toJson(src, typeOf<T>().type, writer)

public inline fun <reified T> Gson.toJson(src: Any, writer: JsonWriter): Unit = toJson(src, typeOf<T>().type, writer)

public inline fun <reified T> Gson.fromJson(json: String): T = fromJson(json, typeOf<T>().type)

public inline fun <reified T> Gson.fromJson(json: Reader): T = fromJson(json, typeOf<T>().type)

public inline fun <reified T> Gson.fromJson(reader: JsonReader): T = fromJson(reader, typeOf<T>().type)
