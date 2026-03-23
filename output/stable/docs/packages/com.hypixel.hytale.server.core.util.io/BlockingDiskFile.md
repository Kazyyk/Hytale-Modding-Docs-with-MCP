---
title: "BlockingDiskFile"
kind: "class"
package: "com.hypixel.hytale.server.core.util.io"
fqcn: "com.hypixel.hytale.server.core.util.io.BlockingDiskFile"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "io"
---

**Package:** `com.hypixel.hytale.server.core.util.io`

```java
public abstract class BlockingDiskFile
```

Class in the io subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `path` | `Path` | final Path field. |

## Constructors

| Constructor | Description |
|---|---|
| `BlockingDiskFile(Path path)` | Creates a new BlockingDiskFile instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `read(BufferedReader var1)` | `void` | protected method. |
| `write(BufferedWriter var1)` | `void` | protected method. |
| `create(BufferedWriter var1)` | `void` | protected method. |
| `syncLoad()` | `void` | public method. |
| `syncSave()` | `void` | public method. |
| `toLocalFile()` | `File` | protected method. |
