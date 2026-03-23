---
title: "UIGalleryPage"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system.pages"
fqcn: "com.hypixel.hytale.server.core.command.system.pages.UIGalleryPage"
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
public class UIGalleryPage extends InteractiveCustomUIPage<UIGalleryPage.UIGalleryEventData>
```

An interactive custom UI page that showcases the available UI component library. Organized by categories (buttons, inputs, selection, containers, text, sliders, progress, scrollbars, navigation, tooltips) with expandable code blocks showing usage examples.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `build( Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store )` |
| `public` | `void` | `handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, UIGalleryPage.UIGalleryEventData data)` |
| `public` | `String` | `getId()` |
| `public` | `String` | `getNameKey()` |
| `public` | `String` | `getDescriptionKey()` |
| `public` | `String` | `getContentPath()` |
| `public` | `int` | `getCodeBlockCount()` |
| `public static` | `UIGalleryPage.Category` | `fromId(String id)` |
| `public static final` | `BuilderCodec<UIGalleryPage.UIGalleryEventData> CODEC =` | `BuilderCodec.builder( UIGalleryPage.UIGalleryEventData.class, UIGalleryPage.UIGalleryEventData::new )` |
