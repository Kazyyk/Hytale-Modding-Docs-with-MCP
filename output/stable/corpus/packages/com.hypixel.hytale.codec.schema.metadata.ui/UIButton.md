# UIButton

Type: class | Package: com.hypixel.hytale.codec.schema.metadata.ui

public class UIButton

Represents a UI button definition used by the codec schema metadata system. Contains a text ID (for localization) and a button ID (for event binding). Serialized via `BuilderCodec` with keys `"textId"` and `"buttonId"`.

## Fields

- public static final BuilderCodec<UIButton> CODEC
- private String buttonId
- private String textId

## Constructors


public UIButton(String textId, String buttonId)


protected UIButton()

## Related Types

- UICreateButtons -- uses `UIButton` arrays to configure create buttons
- UISidebarButtons -- uses `UIButton` arrays to configure sidebar buttons
