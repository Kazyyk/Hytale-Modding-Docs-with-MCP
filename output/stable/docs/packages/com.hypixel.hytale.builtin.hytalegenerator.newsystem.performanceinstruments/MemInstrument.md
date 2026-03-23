---
title: "MemInstrument"
kind: "interface"
package: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.performanceinstruments"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.newsystem.performanceinstruments.MemInstrument"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "newsystem"
  - "performanceinstruments"
  - "interface"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.newsystem.performanceinstruments`

```java
public interface MemInstrument
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `` | `long` | `BYTES_IN_MEGABYTES` |
| `` | `long` | `INT_SIZE` |
| `` | `long` | `DOUBLE_SIZE` |
| `` | `long` | `BOOLEAN_SIZE` |
| `` | `long` | `OBJECT_REFERENCE_SIZE` |
| `` | `long` | `OBJECT_HEADER_SIZE` |
| `` | `long` | `ARRAY_HEADER_SIZE` |
| `` | `long` | `CLASS_OBJECT_SIZE` |
| `` | `long` | `ARRAYLIST_OBJECT_SIZE` |
| `` | `long` | `VECTOR3I_SIZE` |
| `` | `long` | `VECTOR3D_SIZE` |
| `` | `long` | `HASHMAP_ENTRY_SIZE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull` | `MemInstrument.Report` | `getMemoryUsage()` |

## Inner Types

- `MemInstrument.Report`
