---
title: "Validator"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.validators"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.validators.Validator"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "validator"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder.validators`

```java
public abstract class Validator
```

Abstract base class for all NPC asset builder validators. Validators check NPC configuration data at load time to ensure correctness. Concrete implementations are registered in [ValidatorTypeRegistry](ValidatorTypeRegistry.md) with JSON type discriminator names.
