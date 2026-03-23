---
title: "MemInstrument.Report"
kind: "record"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.performanceinstruments"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.performanceinstruments.MemInstrument.Report"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "performanceinstruments"
  - "record"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.performanceinstruments`

```java
public record MemInstrument.Report(long size_bytes)
```

Wraps a memory size in bytes. Asserts that the size is non-negative on construction.

## Components

| Type | Name |
|---|---|
| `long` | `size_bytes` |
