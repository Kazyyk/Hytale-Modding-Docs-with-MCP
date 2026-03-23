---
title: "RevolveOperation"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.tooloperations"
fqcn: "com.hypixel.hytale.builtin.buildertools.tooloperations.RevolveOperation"
api_surface: false
extends: "ToolOperation"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T20:55:01Z"
tags:
  - "buildertools"
  - "creative"
  - "tool-operation"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.tooloperations`

```java
public class RevolveOperation extends ToolOperation
```

Builder tool operation that revolves (radially copies) the current selection around a center point. Supports neighbor sampling, reverse sampling, and disabled sampling modes. Can copy both blocks and entities, with configurable copy count, center (player or target), and custom distance.
