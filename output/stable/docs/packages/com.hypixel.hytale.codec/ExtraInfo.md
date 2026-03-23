---
title: "ExtraInfo"
kind: "interface"
package: "com.hypixel.hytale.codec"
fqcn: "com.hypixel.hytale.codec.ExtraInfo"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "interface"
---

**Package:** `com.hypixel.hytale.codec`

```java
public abstract class ExtraInfo
```

Abstract base class providing contextual information during codec encode/decode operations. Tracks key paths for error reporting and provides push/pop operations for navigating nested structures.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `pushKey(String key, RawJsonReader reader)` |
| `public` | `void` | `pushIntKey(int key, RawJsonReader reader)` |
| `public` | `void` | `popKey()` |
| `public` | `String` | `getKeyPath()` |
