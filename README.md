# Notes API 📒

Prosty serwis do tworzenia i zarządzania notatkami stworzony w Spring Boot 3.

## Technologia 📚

- Java 21
- Spring Boot 3.4.4
- Spring Web, Spring Data JPA
- Baza danych H2 (testowo)
- Maven

## Funkcje dostępne 🛠️

- [x] Pobieranie listy wszystkich notatek (`GET /api/notes`)
- [x] Struktura projektu (controller, service, repository, model)
- [x] Wbudowana baza danych H2 (w pamięci)
- [x] Maven jako system budowania
- [x] Konfiguracja projektu z użyciem Spring Boot Starterów

## Plany rozwoju 🚀

- [ ] Tworzenie nowych notatek (`POST /api/notes`)
- [ ] Aktualizacja istniejących notatek (`PUT /api/notes/{id}`)
- [ ] Usuwanie notatek (`DELETE /api/notes/{id}`)
- [ ] Obsługa błędów HTTP (404, 400)
- [ ] Walidacja danych (np. tytuł nie może być pusty)
- [ ] Dokumentacja API za pomocą Swaggera
- [ ] Wdrożenie produkcyjne na PostgreSQL
- [ ] Dodanie systemu logowania użytkowników (Spring Security)

## Jak uruchomić projekt? 🚀

```bash
git clone https://github.com/malpish0n/notes-app.git
cd notes-app
.\mvnw.cmd spring-boot:run
