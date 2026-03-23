# EditorClientEvent

Type: class | Package: com.hypixel.hytale.builtin.asseteditor.event | Implements: IEvent<KeyType>

public abstract class EditorClientEvent<KeyType> implements IEvent<KeyType>

Base event class for all asset editor events that carry an EditorClient reference. Subclassed by all specific editor events.

## Constructor


public EditorClientEvent(EditorClient editorClient)

## Methods

- EditorClient getEditorClient() | Returns the editor client that triggered this event
