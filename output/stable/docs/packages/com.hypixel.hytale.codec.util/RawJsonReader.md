---
title: "RawJsonReader"
kind: "class"
package: "com.hypixel.hytale.codec.util"
fqcn: "com.hypixel.hytale.codec.util.RawJsonReader"
api_surface: true
extends: null
implements:
  - "AutoCloseable"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "codec"
  - "util"
  - "class"
---

**Package:** `com.hypixel.hytale.codec.util`

```java
public class RawJsonReader implements AutoCloseable
```

Implements `AutoCloseable`.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `ThreadLocal<char[]>` | `READ_BUFFER` | `ThreadLocal.withInitial(() -> new char[131072])` |
| `public static final` | `int` | `DEFAULT_CHAR_BUFFER_SIZE` | `32768` |
| `public static final` | `int` | `MIN_CHAR_BUFFER_READ` | `16384` |
| `public static final` | `int` | `BUFFER_GROWTH` | `1048576` |
| `public static final` | `int` | `ERROR_LINES_BUFFER` | `10` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `int` | `streamIndex` |
| `@Nullable private` | `Reader` | `in` |
| `@Nullable private` | `char[]` | `buffer` |
| `private` | `int` | `bufferIndex` |
| `private` | `int` | `bufferSize` |
| `private` | `int` | `markIndex` |
| `private` | `int` | `markLine` |
| `private` | `int` | `markLineStart` |
| `private` | `StringBuilder` | `tempSb` |
| `private` | `int` | `line` |
| `private` | `int` | `lineStart` |
