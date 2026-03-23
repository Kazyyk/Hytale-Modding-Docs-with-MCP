---
title: "DefaultMap"
kind: "class"
package: "com.hypixel.hytale.common.map"
fqcn: "com.hypixel.hytale.common.map.DefaultMap"
api_surface: false
extends: null
implements:
  - "Map"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "common"
  - "map"
---
**Package:** `com.hypixel.hytale.common.map`

```java
public class DefaultMap<K, V> implements Map<K, V>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Map<K, V>` | `delegate` |
| `private final` | `boolean` | `allowReplacing` |
| `private final` | `boolean` | `replaceNullWithDefault` |
| `private` | `V` | `defaultValue` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `DefaultMap(V defaultValue)` |
| `public` | `` | `DefaultMap(V defaultValue, Map<K, V> delegate)` |
| `public` | `` | `DefaultMap(V defaultValue, Map<K, V> delegate, boolean allowReplacing)` |
| `public` | `` | `DefaultMap(V defaultValue, Map<K, V> delegate, boolean allowReplacing, boolean replaceNullWithDefault)` |
| `public` | `V` | `getDefaultValue()` |
| `public` | `void` | `setDefaultValue(V defaultValue)` |
| `public` | `Map<K, V>` | `getDelegate()` |
| `public` | `int` | `size()` |
| `public` | `boolean` | `isEmpty()` |
| `public` | `boolean` | `containsKey(Object key)` |
| `public` | `boolean` | `containsValue(Object value)` |
| `public` | `V` | `get(@Nullable Object key)` |
| `public` | `V` | `put(K key, V value)` |
| `public` | `V` | `remove(Object key)` |
| `public` | `void` | `putAll(@Nonnull Map<? extends K, ? extends V> m)` |
| `public` | `void` | `clear()` |
| `public` | `Set<K>` | `keySet()` |
| `public` | `Collection<V>` | `values()` |
| `public` | `Set<Entry<K, V>>` | `entrySet()` |
| `public` | `boolean` | `equals(@Nullable Object o)` |
| `public` | `int` | `hashCode()` |
| `public` | `V` | `getOrDefault(Object key, V defaultValue)` |
| `public` | `void` | `forEach(BiConsumer<? super K, ? super V> action)` |
| `public` | `void` | `replaceAll(BiFunction<? super K, ? super V, ? extends V> function)` |
| `public` | `V` | `putIfAbsent(K key, V value)` |
| `public` | `boolean` | `remove(Object key, Object value)` |
| `public` | `boolean` | `replace(K key, V oldValue, V newValue)` |
| `public` | `V` | `replace(K key, V value)` |
| `public` | `V` | `computeIfAbsent(K key, @Nonnull Function<? super K, ? extends V> mappingFunction)` |
| `public` | `V` | `computeIfPresent(K key, @Nonnull BiFunction<? super K, ? super V, ? extends V> remappingFunction)` |
| `public` | `V` | `compute(K key, @Nonnull BiFunction<? super K, ? super V, ? extends V> remappingFunction)` |
| `public` | `V` | `merge(K key, @Nonnull V value, @Nonnull BiFunction<? super V, ? super V, ? extends V> remappingFunction)` |
| `public` | `String` | `toString()` |
