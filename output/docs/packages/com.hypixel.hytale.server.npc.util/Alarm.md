---
title: "Alarm"
kind: "class"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.Alarm"
api_surface: false
extends: "PersistentParameter"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.npc.util`

```java
public class Alarm extends PersistentParameter<Instant>
```

A persistent NPC parameter that stores an `Instant` timestamp. Used to set time-based alarms that can be checked against the current time to determine if they have passed.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static final` | `BuilderCodec<Alarm> CODEC =` | `BuilderCodec.builder(Alarm.class, Alarm::new)` |
| `public` | `boolean` | `isSet()` |
| `public` | `boolean` | `hasPassed(Instant instant)` |
