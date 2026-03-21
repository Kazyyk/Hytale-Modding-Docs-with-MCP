---
title: "ComponentInfo"
kind: "class"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.ComponentInfo"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.npc.util`

```java
public class ComponentInfo
```

A diagnostic helper class that records component metadata (name, index, nesting depth) and field descriptions for NPC debugging output.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `addField(String field)` |
| `public` | `String` | `toString()` |
| `public` | `String` | `getName()` |
| `public` | `int` | `getIndex()` |
| `public` | `List<String>` | `getFields()` |
