---
title: "VoidEventConfig"
kind: "class"
package: "com.hypixel.hytale.builtin.portals.components.voidevent.config"
fqcn: "com.hypixel.hytale.builtin.portals.components.voidevent.config.VoidEventConfig"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "portals"
  - "components"
  - "voidevent"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.portals.components.voidevent.config`

```java
public class VoidEventConfig
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<VoidEventConfig>` | `CODEC` |
| `private` | `int` | `durationSeconds` |
| `private` | `InvasionPortalConfig` | `portalConfig` |
| `private` | `VoidEventStage[]` | `stages` |
| `private` | `List<VoidEventStage>` | `stagesSortedByStartTime` |
| `private` | `String` | `musicAmbienceFX` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getDurationSeconds()` |
| `public` | `int` | `getShouldStartAfterSeconds(int portalTimeLimitSeconds)` |
| `public` | `InvasionPortalConfig` | `getInvasionPortalConfig()` |
| `public` | `VoidEventStage[]` | `getStages()` |
| `public` | `List<VoidEventStage>` | `getStagesSortedByStartTime()` |
| `@Nullable public` | `String` | `getMusicAmbienceFX()` |
| `private` | `void` | `processConfig()` |
