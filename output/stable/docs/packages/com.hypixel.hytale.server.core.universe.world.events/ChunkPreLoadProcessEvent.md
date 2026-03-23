---
title: "ChunkPreLoadProcessEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.events"
fqcn: "com.hypixel.hytale.server.core.universe.world.events.ChunkPreLoadProcessEvent"
api_surface: false
extends: "ChunkEvent"
implements: ["IProcessedEvent"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "events"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.events`

```java
public class ChunkPreLoadProcessEvent extends ChunkEvent implements IProcessedEvent
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `boolean` | `newlyGenerated` |
| `private` | `long` | `lastDispatchNanos` |
| `private` | `boolean` | `didLog` |
| `private final` | `Holder<ChunkStore>` | `holder` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `isNewlyGenerated()` |
| `public` | `Holder<ChunkStore>` | `getHolder()` |
| `@Override public` | `void` | `processEvent(String hookName)` |
| `public` | `boolean` | `didLog()` |
| `@Nonnull @Override public` | `String` | `toString()` |
