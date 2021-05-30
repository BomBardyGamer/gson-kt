@file:JvmMultifileClass
@file:JvmName("GsonKt")
package me.bardy.gsonkt

import com.google.gson.GsonBuilder

public inline fun <reified T> GsonBuilder.registerTypeAdapter(adapter: Any): GsonBuilder = registerTypeAdapter(typeOf<T>().type, adapter)

public inline fun <reified T> GsonBuilder.registerTypeHierarchyAdapter(adapter: Any): GsonBuilder = registerTypeHierarchyAdapter(T::class.java, adapter)
