prettier --check "*.md"
prettier --write "*.md"
mdtodoc *.md --join
mdtodoc MERGED.md --layout "page" --theme "github" --highlight-style "atom-one-light"
html2pdf MERGED.html README.pdf
