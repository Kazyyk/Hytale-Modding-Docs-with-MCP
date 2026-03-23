---
title: "IComponentExecutionControl"
kind: "interface"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.IComponentExecutionControl"
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
public interface IComponentExecutionControl
```

Interface for NPC components with execution gating logic. Provides delay processing, one-shot triggering, and triggered-state queries.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| | `boolean` | `processDelay(float var1)` |
| | `void` | `clearOnce()` |
| | `void` | `setOnce()` |
| | `boolean` | `isTriggered()` |
