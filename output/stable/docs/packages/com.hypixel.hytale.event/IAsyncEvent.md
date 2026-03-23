---
title: "IAsyncEvent"
kind: "interface"
package: "com.hypixel.hytale.event"
fqcn: "com.hypixel.hytale.event.IAsyncEvent"
api_surface: true
extends: null
implements:
  - "IBaseEvent<KeyType>"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "event"
  - "interface"
  - "api"
---

**Package:** `com.hypixel.hytale.event`

```java
public interface IAsyncEvent implements IBaseEvent<KeyType>
```

Marker interface for asynchronous events dispatched via `CompletableFuture`.
