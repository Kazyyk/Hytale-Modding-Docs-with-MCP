---
title: "BlockInteractionUtils"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.BlockInteractionUtils"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "interaction"
  - "block"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction`

```java
public class BlockInteractionUtils
```

Utility class with helper methods for block interaction logic.

## Static Methods

```java
public static boolean isNaturalAction(@Nullable Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Returns `true` if the action should be treated as a "natural" block break (i.e., the player is in Adventure mode, or no player entity is associated with the ref). Natural actions produce item drops; non-natural (Creative mode) actions suppress drops.
