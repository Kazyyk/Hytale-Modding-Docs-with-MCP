---
title: "ChoiceElement"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player.pages.choices"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.pages.choices.ChoiceElement"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "entity"
  - "player"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player.pages.choices`

```java
public abstract class ChoiceElement
```

Class in the choices subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `displayNameKey` | `String` | String field. |
| `descriptionKey` | `String` | String field. |
| `interactions` | `ChoiceInteraction[]` | ChoiceInteraction[] field. |
| `requirements` | `ChoiceRequirement[]` | ChoiceRequirement[] field. |

## Constructors

| Constructor | Description |
|---|---|
| `ChoiceElement(String displayNameKey, String descriptionKey, ChoiceInteraction[] interactions, ChoiceRequirement[] requirements)` | Creates a new ChoiceElement instance. |
| `ChoiceElement()` | Creates a new ChoiceElement instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getDisplayNameKey()` | `String` | public method. |
| `getDescriptionKey()` | `String` | public method. |
| `getInteractions()` | `ChoiceInteraction[]` | public method. |
| `getRequirements()` | `ChoiceRequirement[]` | public method. |
| `addButton(UICommandBuilder var1, UIEventBuilder var2, String var3, PlayerRef var4)` | `void` | public method. |
| `canFulfillRequirements(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef)` | `boolean` | public method. |
| `toString()` | `String` | public method. |
