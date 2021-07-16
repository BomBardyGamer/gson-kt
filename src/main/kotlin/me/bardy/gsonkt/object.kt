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

import com.google.gson.JsonElement
import com.google.gson.JsonObject

/**
 * Set the value of the given [key] in this object to the given [value], replacing it if it
 * already exists.
 *
 * @param key the key
 * @param value the value
 * @since 1.0
 */
public operator fun JsonObject.set(key: String, value: JsonElement): Unit = add(key, value)

/**
 * Set the value of the given [key] in this object to the given [value], replacing it if it
 * already exists.
 *
 * @param key the key
 * @param value the value
 * @since 1.0
 */
public operator fun JsonObject.set(key: String, value: String): Unit = addProperty(key, value)

/**
 * Set the value of the given [key] in this object to the given [value], replacing it if it
 * already exists.
 *
 * @param key the key
 * @param value the value
 * @since 1.0
 */
public operator fun JsonObject.set(key: String, value: Number): Unit = addProperty(key, value)

/**
 * Set the value of the given [key] in this object to the given [value], replacing it if it
 * already exists.
 *
 * @param key the key
 * @param value the value
 * @since 1.0
 */
public operator fun JsonObject.set(key: String, value: Boolean): Unit = addProperty(key, value)

/**
 * Set the value of the given [key] in this object to the given [value], replacing it if it
 * already exists.
 *
 * @param key the key
 * @param value the value
 * @since 1.0
 */
public operator fun JsonObject.set(key: String, value: Char): Unit = addProperty(key, value)

/**
 * The entry set as a property.
 *
 * @since 1.2
 */
public val JsonObject.entries: Set<Map.Entry<String, JsonElement>>
    get() = entrySet()

/**
 * The key set as a property.
 *
 * @since 1.2
 */
public val JsonObject.keys: Set<String>
    get() = keySet()

/**
 * Returns true if this object contains the specified [key], false otherwise.
 *
 * @return true if this object contains the specified [key], false otherwise
 * @since 1.2
 * @see JsonObject.has
 */
public operator fun JsonObject.contains(key: String): Boolean = has(key)

/**
 * Convert this [JsonObject] to a [MutableIterable], so it can be iterated over like a normal [Map].
 *
 * @return a [MutableIterable] for iterating over the elements of this [JsonObject]
 * @since 1.0
 */
public fun JsonObject.asIterable(): MutableIterable<Map.Entry<String, JsonElement>> =
    object : MutableIterable<Map.Entry<String, JsonElement>> {
        override fun iterator(): MutableIterator<Map.Entry<String, JsonElement>> = entrySet().iterator()
    }
