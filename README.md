# capacitor-plugin-navigationbar

Control navigation bar for Android devices only

## TODO: Install

```bash
npm install capacitor-plugin-navigationbar
npx cap sync
```

## Example

```typescript
NavigationBar.setBackgroundColor({ color: '#ffffff' });
NavigationBar.setStyle({ style: 'Light' });
```

## API

<docgen-index>

* [`setBackgroundColor(...)`](#setbackgroundcolor)
* [`setNavigationBarDividerColor(...)`](#setnavigationbardividercolor)
* [`setNavigationBarContrastEnforced(...)`](#setnavigationbarcontrastenforced)
* [`setStyle(...)`](#setstyle)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### setBackgroundColor(...)

```typescript
setBackgroundColor(options: { color: string; }) => Promise<void>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ color: string; }</code> |

--------------------


### setNavigationBarDividerColor(...)

```typescript
setNavigationBarDividerColor(options: { color: string; }) => Promise<void>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ color: string; }</code> |

--------------------


### setNavigationBarContrastEnforced(...)

```typescript
setNavigationBarContrastEnforced(options: { enforceContrast: boolean; }) => Promise<void>
```

| Param         | Type                                       |
| ------------- | ------------------------------------------ |
| **`options`** | <code>{ enforceContrast: boolean; }</code> |

--------------------


### setStyle(...)

```typescript
setStyle(options: { style: 'Light' | 'Dark'; }) => Promise<void>
```

| Param         | Type                                       |
| ------------- | ------------------------------------------ |
| **`options`** | <code>{ style: 'Light' \| 'Dark'; }</code> |

--------------------

</docgen-api>
