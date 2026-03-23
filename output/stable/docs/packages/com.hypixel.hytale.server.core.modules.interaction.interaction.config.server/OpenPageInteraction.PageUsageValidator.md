---
title: "OpenPageInteraction.PageUsageValidator"
kind: "interface"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.OpenPageInteraction.PageUsageValidator"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "ui"
  - "functional-interface"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
@FunctionalInterface
public interface OpenPageInteraction.PageUsageValidator
```

Functional interface for validating whether a player can open a specific page. Registered per `Page` via `OpenPageInteraction.registerUsageValidator`.

## Methods

```java
boolean canUse(Ref<EntityStore> var1, Player var2, InteractionContext var3, ComponentAccessor<EntityStore> var4)
```

Returns `true` if the player is allowed to open the page in the given context.

## See Also

- [OpenPageInteraction](OpenPageInteraction.md)
