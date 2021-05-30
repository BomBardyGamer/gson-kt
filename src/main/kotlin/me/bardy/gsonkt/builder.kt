@file:JvmMultifileClass
@file:JvmName("GsonKt")
package me.bardy.gsonkt

import com.google.gson.GsonBuilder

/**
 * Register a type adapter for the given type [T].
 *
 * This will create a new [com.google.gson.reflect.TypeToken] under the hood, with the use of [typeOf], so it can support
 * generic parameters.
 *
 * @param T the type this adapter is for
 * @param adapter the adapter instance for the given type
 * @return this builder
 * @since 1.1
 */
public inline fun <reified T> GsonBuilder.registerTypeAdapter(adapter: Any): GsonBuilder = registerTypeAdapter(typeOf<T>().type, adapter)

/**
 * Register a type adapter for the given type [T] and its subtypes.
 *
 * This will create a new [com.google.gson.reflect.TypeToken] under the hood, with the use of [typeOf], so it can support
 * generic parameters.
 *
 * @param T the type this adapter is for
 * @param adapter the adapter instance for the given type
 * @return this builder
 * @since 1.1
 */
public inline fun <reified T> GsonBuilder.registerTypeHierarchyAdapter(adapter: Any): GsonBuilder = registerTypeHierarchyAdapter(T::class.java, adapter)
