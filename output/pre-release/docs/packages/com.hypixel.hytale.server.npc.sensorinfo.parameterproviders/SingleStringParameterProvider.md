---
title: "SingleStringParameterProvider"
kind: "class"
package: "com.hypixel.hytale.server.npc.sensorinfo.parameterproviders"
fqcn: "com.hypixel.hytale.server.npc.sensorinfo.parameterproviders.SingleStringParameterProvider"
api_surface: false
extends: "SingleParameterProvider"
implements: ["StringParameterProvider"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "sensorinfo"
  - "parameterproviders"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.sensorinfo.parameterproviders`

```java
public class SingleStringParameterProvider extends SingleParameterProvider implements StringParameterProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `String` | `value` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable @Override public` | `String` | `getStringParameter()` |
| `@Override public` | `void` | `clear()` |
| `public` | `void` | `overrideString(String value)` |
