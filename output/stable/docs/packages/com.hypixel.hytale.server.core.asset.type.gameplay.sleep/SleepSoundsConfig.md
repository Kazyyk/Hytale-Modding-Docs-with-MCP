---
title: "SleepSoundsConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.gameplay.sleep"
fqcn: "com.hypixel.hytale.server.core.asset.type.gameplay.sleep.SleepSoundsConfig"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "gameplay"
  - "sleep"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.gameplay.sleep`

```java
public class SleepSoundsConfig
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<SleepSoundsConfig>` | `CODEC` |
| `private` | `String` | `success` |
| `private` | `String` | `fail` |
| `private` | `String` | `notification` |
| `private` | `String` | `notificationLoop` |
| `private` | `int` | `notificationCooldownSeconds` |
| `private` | `boolean` | `notificationLoopEnabled` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public` | `String` | `getSuccess()` |
| `public` | `int` | `getSuccessIndex()` |
| `@Nullable public` | `String` | `getFail()` |
| `public` | `int` | `getFailIndex()` |
| `@Nullable public` | `String` | `getNotification()` |
| `public` | `int` | `getNotificationIndex()` |
| `@Nullable public` | `String` | `getNotificationLoop()` |
| `public` | `int` | `getNotificationLoopIndex()` |
| `public` | `long` | `getNotificationCooldownSeconds()` |
| `public` | `long` | `getNotificationLoopCooldownMs()` |
| `public` | `boolean` | `isNotificationLoopEnabled()` |
