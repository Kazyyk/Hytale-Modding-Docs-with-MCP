---
title: "CaveNodeChildEntryJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.cave"
fqcn: "com.hypixel.hytale.server.worldgen.loader.cave.CaveNodeChildEntryJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, CaveNodeType.CaveNodeChildEntry>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "cave"
  - "loader"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.cave`

```java
public class CaveNodeChildEntryJsonLoader extends JsonLoader<SeedStringResource, CaveNodeType.CaveNodeChildEntry>
```

JSON loader for cave node child entries. Parses the child node type references (inline or by name via [CaveNodeTypeStorage](CaveNodeTypeStorage.md)), anchor position, offset, rotation options, children limit, repeat count, pitch/yaw modifiers, spawn chance, and yaw mode. Supports weighted lists of node types.
