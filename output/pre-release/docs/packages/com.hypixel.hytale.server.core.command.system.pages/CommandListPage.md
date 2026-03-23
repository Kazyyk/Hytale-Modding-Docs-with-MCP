---
title: "CommandListPage"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system.pages"
fqcn: "com.hypixel.hytale.server.core.command.system.pages.CommandListPage"
api_surface: false
extends: "InteractiveCustomUIPage"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "command"
  - "ui"
  - "pages"
---

**Package:** `com.hypixel.hytale.server.core.command.system.pages`

```java
public class CommandListPage extends InteractiveCustomUIPage<CommandListPage.CommandListPageEventData>
```

An interactive custom UI page that provides an in-game command browser. Displays a searchable list of available commands, subcommand navigation with breadcrumbs, variant selection, parameter details with type information, and a send-to-chat feature. Filters commands based on player permissions.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `build( Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store )` |
| `public` | `void` | `handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, CommandListPage.CommandListPageEventData data)` |
| `public static final` | `BuilderCodec<CommandListPage.CommandListPageEventData> CODEC =` | `BuilderCodec.builder( CommandListPage.CommandListPageEventData.class, CommandListPage.CommandListPageEventData::new )` |
| `public static final` | `Comparator<CommandListPage.SearchResult> COMPARATOR =` | `Comparator.comparing(o -> o.match)` |
