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

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonElement
import com.google.gson.JsonSerializationContext

/**
 * Serialize the given object [src] of type [T] into a [JsonElement].
 *
 * This will create a new [com.google.gson.reflect.TypeToken] under the hood, with the use of [typeOf], so it can support
 * generic parameters.
 *
 * @param T the type to serialize
 * @param src the instance of the type to serialize
 * @return the serialized [JsonElement]
 * @since 1.0
 */
public inline fun <reified T> JsonSerializationContext.serialize(src: Any): JsonElement = serialize(src, typeOf<T>().type)

/**
 * Deserialize the given [JsonElement] into an object of type [T].
 *
 * This will create a new [com.google.gson.reflect.TypeToken] under the hood, with the use of [typeOf], so it can support
 * generic parameters.
 *
 * @param T the type to deserialize to
 * @param json the [JsonElement] to deserialize from
 * @return the deserialized type
 * @since 1.0
 */
public inline fun <reified T> JsonDeserializationContext.deserialize(json: JsonElement): T = deserialize(json, typeOf<T>().type)
