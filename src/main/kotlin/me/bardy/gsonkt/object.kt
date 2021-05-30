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

public operator fun JsonObject.set(key: String, value: JsonElement): Unit = add(key, value)

public operator fun JsonObject.set(key: String, value: String): Unit = addProperty(key, value)

public operator fun JsonObject.set(key: String, value: Number): Unit = addProperty(key, value)

public operator fun JsonObject.set(key: String, value: Boolean): Unit = addProperty(key, value)

public operator fun JsonObject.set(key: String, value: Char): Unit = addProperty(key, value)

public fun JsonObject.asIterable(): MutableIterable<Map.Entry<String, JsonElement>> =
    object : MutableIterable<Map.Entry<String, JsonElement>> {
        override fun iterator(): MutableIterator<Map.Entry<String, JsonElement>> = entrySet().iterator()
    }
