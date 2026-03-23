---
title: "IAnnotatedComponent"
kind: "interface"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.IAnnotatedComponent"
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
public interface IAnnotatedComponent
```

Interface for NPC components that can provide debug annotation and hierarchical breadcrumb paths. Used by the NPC debugging infrastructure.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| | `void` | `getInfo(Role var1, ComponentInfo var2)` |
| | `void` | `setContext(IAnnotatedComponent var1, int var2)` |
| | `IAnnotatedComponent` | `getParent()` |
| | `int` | `getIndex()` |
| `default` | `String` | `getLabel()` |
| `default` | `void` | `getBreadCrumbs(@Nonnull StringBuilder sb)` |
| `default` | `String` | `getBreadCrumbs()` |
