---
title: "DialogPage"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.DialogPage"
api_surface: false
extends: "InteractiveCustomUIPage"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "adventure"
  - "objectives"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives`

```java
public class DialogPage extends InteractiveCustomUIPage<DialogPage.DialogPageEventData>
```

A custom UI page that displays an NPC dialog during a use-entity objective task. Shows an entity name and dialog text, with a close button that dismisses the page.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `build( Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store )` |
| `public` | `void` | `handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, DialogPage.DialogPageEventData data)` |
| `public static final` | `BuilderCodec<DialogPage.DialogPageEventData> CODEC =` | `BuilderCodec.builder( DialogPage.DialogPageEventData.class, DialogPage.DialogPageEventData::new )` |
