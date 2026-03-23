---
title: "LoadAssetEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.asset"
fqcn: "com.hypixel.hytale.server.core.asset.LoadAssetEvent"
api_surface: false
extends: null
implements: ["IEvent<Void>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "asset"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.asset`

```java
public class LoadAssetEvent implements IEvent<Void>
```

Event fired during the boot sequence to trigger asset loading. Carries the boot start timestamp and failure state for validation reporting.
