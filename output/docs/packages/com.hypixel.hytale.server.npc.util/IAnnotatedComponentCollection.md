---
title: "IAnnotatedComponentCollection"
kind: "interface"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.IAnnotatedComponentCollection"
api_surface: false
extends: "IAnnotatedComponent"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.npc.util`

```java
public interface IAnnotatedComponentCollection extends IAnnotatedComponent
```

Interface extending `IAnnotatedComponent` for components that contain multiple child components, supporting indexed access.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| | `int` | `componentCount()` |
| | `IAnnotatedComponent` | `getComponent(int var1)` |
