---
title: "CaseInsensitiveHashStrategy"
kind: "class"
package: "com.hypixel.hytale.assetstore.map"
fqcn: "com.hypixel.hytale.assetstore.map.CaseInsensitiveHashStrategy"
api_surface: false
extends: ~
implements: 
  - "Hash.Strategy"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
tags:
  - "asset"
  - "map"
  - "hashing"
---

**Package:** `com.hypixel.hytale.assetstore.map`

```java
public class CaseInsensitiveHashStrategy<K> implements Strategy<K>
```

Singleton hash strategy providing case-insensitive hashing and equality for `String` keys. For non-string keys, delegates to standard `hashCode()` and `equals()`.

## Methods

```java
public static <K> CaseInsensitiveHashStrategy<K> getInstance()
```

```java
public int hashCode(K key)
```

```java
public boolean equals(K a, K b)
```
