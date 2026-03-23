---
title: "TranslationMap"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.i18n.generator"
fqcn: "com.hypixel.hytale.server.core.modules.i18n.generator.TranslationMap"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "modules"
  - "i18n"
  - "generator"
---

**Package:** `com.hypixel.hytale.server.core.modules.i18n.generator`

```java
public class TranslationMap
```

Utility type in the `generator` subsystem.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `get(String key)` | `String` | Accessor method. |

## Methods

| Method | Returns | Description |
|---|---|---|
| `put(String key, String value)` | `void` | Instance method. |
| `removeKeys(Collection<? extends String> keys)` | `void` | Instance method. |
| `size()` | `int` | Instance method. |
| `putAbsentKeys(TranslationMap other)` | `void` | Instance method. |
| `sortByKeyBeforeFirstDot()` | `void` | Instance method. |
| `asMap()` | `Map<String, String>` | Instance method. |
