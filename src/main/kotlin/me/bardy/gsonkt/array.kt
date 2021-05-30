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

/**
 * Add a [boolean] to this [JsonArray]. Allows doing this with += syntax.
 *
 * This is equivalent to calling [JsonArray.add].
 *
 * @param boolean the boolean to add
 * @since 1.0
 */
public operator fun JsonArray.plusAssign(boolean: Boolean): Unit = add(boolean)

/**
 * Add a [character] to this [JsonArray]. Allows doing this with += syntax.
 *
 * This is equivalent to calling [JsonArray.add].
 *
 * @param character the character to add
 * @since 1.0
 */
public operator fun JsonArray.plusAssign(character: Char): Unit = add(character)

/**
 * Add a [number] to this [JsonArray]. Allows doing this with += syntax.
 *
 * This is equivalent to calling [JsonArray.add].
 *
 * @param number the number to add
 * @since 1.0
 */
public operator fun JsonArray.plusAssign(number: Number): Unit = add(number)

/**
 * Add a [string] to this [JsonArray]. Allows doing this with += syntax.
 *
 * This is equivalent to calling [JsonArray.add].
 *
 * @param string the string to add
 * @since 1.0
 */
public operator fun JsonArray.plusAssign(string: String): Unit = add(string)

/**
 * Add a JSON [element] to this [JsonArray]. Allows doing this with += syntax.
 *
 * This is equivalent to calling [JsonArray.add].
 *
 * @param element the JSON element to add
 * @since 1.0
 */
public operator fun JsonArray.plusAssign(element: JsonElement): Unit = add(element)

/**
 * Add all values from a JSON [array] to this [JsonArray]. Allows doing this with += syntax.
 *
 * This is equivalent to calling [JsonArray.addAll].
 *
 * @param array the other array to add the values from
 * @since 1.0
 */
public operator fun JsonArray.plusAssign(array: JsonArray): Unit = addAll(array)
