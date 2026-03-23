# UIEditor

Type: class | Package: com.hypixel.hytale.codec.schema.metadata.ui | Implements: Metadata

public class UIEditor implements Metadata

Schema metadata that assigns a custom editor component to a property in the editor UI. Uses a `CodecMapCodec` registry to resolve editor component types by name. Built-in editor components are registered in the `init()` method: `Timeline`, `WeightedTimeline`, `Number`, `Text`, `MultilineText`, `Dropdown`, `Icon`, and `LocalizationKey`.

## Fields

- public static final CodecMapCodec<UIEditor.EditorComponent> CODEC
- public static final UIEditor.Timeline TIMELINE
- public static final UIEditor.WeightedTimeline WEIGHTED_TIMELINE
- private final UIEditor.EditorComponent component

## Constructors


public UIEditor(UIEditor.EditorComponent component)

## Methods

- public void modify(@Nonnull Schema schema)
- public static void init()

## Inner Types

### EditorComponent


public interface EditorComponent

Marker interface for editor component implementations.

### Timeline


public static class Timeline implements UIEditor.EditorComponent

Editor component for timeline-style editing.

### WeightedTimeline


public static class WeightedTimeline implements UIEditor.EditorComponent

Editor component for weighted timeline editing.

### FormattedNumber


public static class FormattedNumber implements UIEditor.EditorComponent

Number editor with configurable step, suffix, and decimal places. Has fluent setters `setStep()`, `setSuffix()`, and `setMaxDecimalPlaces()`.

### TextField


public static class TextField implements UIEditor.EditorComponent

Text field editor with an optional `dataSet` reference.

### MultilineTextField


public static class MultilineTextField implements UIEditor.EditorComponent

Multiline text editor component.

### Dropdown


public static class Dropdown implements UIEditor.EditorComponent

Dropdown selector bound to a `dataSet`.

### Icon


public static class Icon implements UIEditor.EditorComponent

Icon editor with `defaultPathTemplate`, `width`, and `height`.

### LocalizationKeyField


public static class LocalizationKeyField implements UIEditor.EditorComponent

Localization key editor with `keyTemplate` and optional `generateDefaultKey` flag.

Also in this package: ClientCache, DisplayMode, Dropdown, EditorComponent, EditorFeature, FormattedNumber, Icon, LocalizationKeyField, MultilineTextField, PreviewType, TextField, Timeline, UIButton, UICreateButtons, UIDefaultCollapsedState, UIDisplayMode, UIEditorFeatures, UIEditorPreview, UIEditorSectionStart, UIPropertyTitle (and 4 more)

Complete API:
  public void modify(Schema schema)
  public static void init()

Fields:
public static final CodecMapCodec<UIEditor.EditorComponent> CODEC
public static final UIEditor.Timeline TIMELINE
public static final UIEditor.WeightedTimeline WEIGHTED_TIMELINE
private final UIEditor.EditorComponent component
