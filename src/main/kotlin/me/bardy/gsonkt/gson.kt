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

/**
 * Create a [TypeToken] object for the given reified type [T], which can be used to get generic type parameter
 * information at runtime.
 *
 * @param T the type
 * @return a [TypeToken] for the given type [T]
 * @since 1.0
 */
public inline fun <reified T> typeOf(): TypeToken<T> = object : TypeToken<T>() {}

/**
 * Get the corresponding registered [TypeAdapter] for the given type [T], throwing an
 * [IllegalArgumentException] if there is no adapter registered for [T].
 *
 * @param T the type
 * @return the registered [TypeAdapter] for the given type [T]
 * @throws IllegalArgumentException if there is no adapter registered for the given type [T]
 * @since 1.0
 */
public inline fun <reified T> Gson.getAdapter(): TypeAdapter<T> = getAdapter(typeOf<T>())

/**
 * Get an alternate type adapter for the given type [T]. That is, one that is overridden by a [TypeAdapterFactory].
 *
 * See [Gson.getDelegateAdapter] for more information on how this actually works.
 *
 * @param T the type
 * @param skipPast the factory that needs to be skipped while searching for a matching type
 * @return the registered delegate [TypeAdapter] for the given type [T]
 * @since 1.0
 * @see Gson.getDelegateAdapter
 */
public inline fun <reified T> Gson.getDelegateAdapter(skipPast: TypeAdapterFactory): TypeAdapter<T> = getDelegateAdapter(skipPast, typeOf<T>())

/**
 * Convert the given [src] object to a tree of [JsonElement]s.
 *
 * @param T the type
 * @param src the instance of the given type [T] to convert to a [JsonElement] tree
 * @return the converted [JsonElement] tree
 * @since 1.0
 * @see Gson.toJsonTree
 */
public inline fun <reified T> Gson.toJsonTree(src: Any): JsonElement = toJsonTree(src, typeOf<T>().type)

/**
 * Convert the given [src] object to a JSON [String].
 *
 * @param T the type
 * @param src the instance of the given type [T] to convert to a JSON [String]
 * @return a JSON string
 * @since 1.0
 * @see Gson.toJson
 */
public inline fun <reified T> Gson.toJson(src: Any): String = toJson(src, typeOf<T>().type)

/**
 * Write the given [src] object to the given [writer].
 *
 * @param T the type
 * @param src the instance of the given type [T]
 * @param writer the writer to write the JSON to
 * @since 1.0
 * @see Gson.toJson
 */
public inline fun <reified T> Gson.toJson(src: Any, writer: Appendable): Unit = toJson(src, typeOf<T>().type, writer)

/**
 * Write the given [src] object to the given [writer].
 *
 * @param T the type
 * @param src the instance of the given type [T]
 * @param writer the writer to write the JSON to
 * @since 1.0
 * @see Gson.toJson
 */
public inline fun <reified T> Gson.toJson(src: Any, writer: JsonWriter): Unit = toJson(src, typeOf<T>().type, writer)

/**
 * Convert the given [json] string to an object of the given type [T].
 *
 * @param T the type
 * @param json the JSON string
 * @return the JSON object of type [T]
 * @since 1.0
 * @see Gson.fromJson
 */
public inline fun <reified T> Gson.fromJson(json: String): T = fromJson(json, typeOf<T>().type)

/**
 * Deserialize JSON from the given [json] reader.
 *
 * @param T the type
 * @param json the reader to read from
 * @return the JSON object of type [T]
 * @since 1.0
 * @see Gson.fromJson
 */
public inline fun <reified T> Gson.fromJson(json: Reader): T = fromJson(json, typeOf<T>().type)

/**
 * Deserialize JSON from the given [reader].
 *
 * @param T the type
 * @param reader the reader to read from
 * @return the JSON object of type [T]
 * @since 1.0
 * @see Gson.fromJson
 */
public inline fun <reified T> Gson.fromJson(reader: JsonReader): T = fromJson(reader, typeOf<T>().type)
