---
title: "NotPatternOp"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.tagpattern.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.tagpattern.config.NotPatternOp"
api_surface: false
extends: "TagPattern"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "asset"
  - "tags"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.tagpattern.config`

```java
public class NotPatternOp extends TagPattern
```

Concrete implementation extending `TagPattern`.

## Fields

| Field | Type | Description |
|---|---|---|
| `pattern` | `TagPattern` | TagPattern field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `test(Int2ObjectMap<IntSet> tags)` | `boolean` | public method. |
| `toPacket()` | `com.hypixel.hytale.protocol.TagPattern` | public method. |
| `toString()` | `String` | public method. |
