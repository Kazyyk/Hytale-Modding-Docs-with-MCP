---
title: "FillerBlockUtil.ChangeReason"
kind: "enum"
package: "com.hypixel.hytale.server.core.util"
fqcn: "com.hypixel.hytale.server.core.util.FillerBlockUtil.ChangeReason"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-22T00:00:00Z"
tags:
  - "blocks"
  - "filler"
  - "enum"
---

**Package:** `com.hypixel.hytale.server.core.util`

```java
public static enum FillerBlockUtil.ChangeReason
```

Specifies the reason for a filler block change, which determines whether block particles are spawned and their type.

## Enum Constants

| Constant | Description |
|---|---|
| `NONE` | No visual feedback; suppresses block particles. |
| `NORMAL` | Standard block change; spawns normal block particles. |
| `BY_PHYSICS` | Block changed by the physics system; spawns physics-style block particles. |
