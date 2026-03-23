---
title: "CaveTypesJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.cave"
fqcn: "com.hypixel.hytale.server.worldgen.loader.cave.CaveTypesJsonLoader"
api_surface: false
extends: "com.hypixel.hytale.procedurallib.json.JsonLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:30:09Z"
tags:
  - "server"
  - "worldgen"
  - "loader"
  - "cave"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.cave`

```java
public class CaveTypesJsonLoader extends JsonLoader<SeedStringResource, CaveType[]>
```

JSON loader that parses the `Types` array from a caves JSON file. For each entry, delegates to `CaveTypeJsonLoader` to produce a `CaveType`. Supports modify events via `ModifyEvents.CaveTypes`.
