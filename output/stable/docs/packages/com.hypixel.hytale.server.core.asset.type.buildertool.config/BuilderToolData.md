---
title: "BuilderToolData"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.buildertool.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.buildertool.config.BuilderToolData"
api_surface: true
extends: null
implements:
  - "NetworkSerializable<ItemBuilderToolData>"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "buildertool"
  - "class"
  - "api"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.buildertool.config`

```java
public class BuilderToolData implements NetworkSerializable<ItemBuilderToolData>
```

Holds the UI identifiers and array of [BuilderTool](BuilderTool.md) instances associated with an item. Serialized as part of item configuration data.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String[]` | `getUi()` |
| `public` | `BuilderTool[]` | `getTools()` |
| `public` | `ItemBuilderToolData` | `toPacket()` |
