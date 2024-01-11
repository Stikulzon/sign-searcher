Basically updated Sign Searcher to latest versions with some new features like languages support. [Check the original project.](https://github.com/agausmann/sign-searcher)

(**Прогортайте вниз для українського опису**)

Original description (EN):
---
Sign Searcher is designed to help you find signs that match a given query text. Its intended usage is for finding items in larger multiplayer markets, where each person may have their own stall and so hunting for specific items can get difficult or time consuming.
## Install

Install Fabric and Fabric API, and copy the latest jar corresponding to your game version to the mods folder in your game directory.
## Usage

To invoke SignSearcher, use the following (client-side) commands:

   - ```/signsearch <query>``` - Starts a new query with the given text (may contain spaces, does not need to be quoted), and highlights all matching signs.

   - ```/signsearch``` (with no arguments) - Clears the current query, removing the highlight effect from all signs.

## Compatibility

Because of the changes that Sign Searcher makes to the rendering engine, it is incompatible with most optimization mods, but in most cases it can be made compatible. Known combinations are:

   - Sodium - Fully compatible, maintained by me. (Last checked version 5.3)

   - Optifine / Optifabric - Untested, is likely not compatible, and I'm not willing to maintain it myself; however, PRs are welcome!

<details>
  <summary>[UA] Опис українською</summary>
  Sign Searcher розроблений, щоб допомогти вам знайти текст та табичках, які відповідають тексту запиту. Він створений для пошуку предметів на великих багатокористувацьких ринках, де кожна людина може мати власний магазин, тому полювання на певні предмети може бути складним або займати багато часу.
  
  ## Встановлення

  Для роботи встановіть Fabric і API Fabric та скопіюйте останній jar-файл моду, що відповідає вашій версії гри до папки mods у папці гри.
  
  ## Використання
  Щоб користуватись Signsearcher, використовуйте такі команди:

   - ```/signsearch <текст>``` - Починає пошук за заденим текстом (може містити пробіли, лапки не потрібні) і підсвічує всі відповідні таблички.

   - ```/signsearch``` (без аргументів) - Очищає поточний пошуковий запит, видаляючи ефект підсвічування з усіх табличок.

  ## Сумісність

  Через зміни, які Sign Searcher вносить у систему візуалізації, він може бути несумісний із де-якими модами оптимізації, але в більшості випадків його можна зробити сумісним. Відомі комбінації:

   - Sodium - Повністю сумісний, підтримується мною. (Остання перевірена версія 5.3)

   - Optifine / Optifabric - Неперевірено, швидше за все несумісний, і я не бажаю підтримувати його самостійно; однак PRs вітаються!

</details>
