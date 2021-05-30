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

import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonNull
import com.google.gson.JsonObject
import com.google.gson.JsonPrimitive

/**
 * Convert this [JsonElement] to a [JsonObject], returning null if this isn't a [JsonObject].
 *
 * @return this [JsonElement] as a [JsonObject], or null if it isn't a [JsonObject]
 * @since 1.0
 */
public fun JsonElement.toObjectOrNull(): JsonObject? = this as? JsonObject

/**
 * Convert this [JsonElement] to a [JsonArray], returning null if this isn't a [JsonArray].
 *
 * @return this [JsonElement] as a [JsonArray], or null if it isn't a [JsonArray]
 * @since 1.0
 */
public fun JsonElement.toArrayOrNull(): JsonArray? = this as? JsonArray

/**
 * Convert this [JsonElement] to a [JsonPrimitive], returning null if this isn't a [JsonPrimitive].
 *
 * @return this [JsonElement] as a [JsonPrimitive], or null if it isn't a [JsonPrimitive]
 * @since 1.0
 */
public fun JsonElement.toPrimitiveOrNull(): JsonPrimitive? = this as? JsonPrimitive

/**
 * Convert this [JsonElement] to a [JsonNull], returning null if it isn't a [JsonNull].
 *
 * @return this [JsonElement] as a [JsonNull], or null if it isn't a [JsonNull]
 * @since 1.0
 */
public fun JsonElement.toNull(): JsonNull? = this as? JsonNull
