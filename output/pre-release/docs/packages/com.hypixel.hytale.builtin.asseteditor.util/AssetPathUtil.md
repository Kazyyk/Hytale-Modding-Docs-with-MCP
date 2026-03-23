---
title: "AssetPathUtil"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.util"
fqcn: "com.hypixel.hytale.builtin.asseteditor.util.AssetPathUtil"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "util"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.util`

```java
public class AssetPathUtil
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `UNIX_FILE_SEPARATOR` |
| `public static final` | `String` | `FILE_EXTENSION_JSON` |
| `public static final` | `String` | `DIR_SERVER` |
| `public static final` | `String` | `DIR_COMMON` |
| `public static final` | `Path` | `PATH_DIR_COMMON` |
| `public static final` | `Path` | `PATH_DIR_SERVER` |
| `public static final` | `Path` | `EMPTY_PATH` |
| `private static final` | `Pattern` | `INVALID_FILENAME_CHAR_REGEX` |
| `private static final` | `String[]` | `RESERVED_NAMES` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `boolean` | `isInvalidFileName(Path path)` |
| `public static` | `String` | `removeInvalidFileNameChars(String name)` |
| `@Nonnull private static` | `String` | `getIdFromPath(Path path)` |
